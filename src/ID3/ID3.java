/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ID3;

import dbProcess.database;
import frame.mainPage;
import java.io.*;
import java.util.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import values.id3Values;

public class ID3 {

    int OznitelikNumarasi = 5;
    String[] OznitelikIsimleri;
    Vector[] EtkiAlanlari;
    ArrayList<id3Values> donenDegerArray = new ArrayList<>();
    int counter = 0;

    class DataPoint {

        public int[] OzNitelikleri;

        public DataPoint(int numattributes) {
            OzNitelikleri = new int[numattributes];
        }
    };

    class TreeNode {

        public double DugunNoktalari;
        public Vector veri;
        public int AyrismaOzniteligi;
        public int AyrismaDegeri;
        public TreeNode[] AltDugum;
        public TreeNode UstDugum;

        public TreeNode() {
            veri = new Vector();
        }
    };
    TreeNode kok = new TreeNode();

    public int SembolDegeriniGetir(int nitelik, String sembol) {
        int index = EtkiAlanlari[nitelik].indexOf(sembol);
        if (index < 0) {
            EtkiAlanlari[nitelik].addElement(sembol);
            return EtkiAlanlari[nitelik].size() - 1;
        }
        return index;
    }

    public int[] ButunDegerleriGetir(Vector veri, int nitelik) {
        Vector degerler = new Vector();
        int say = veri.size();
        for (int i = 0; i < say; i++) {
            DataPoint point = (DataPoint) veri.elementAt(i);
            String sembol = (String) EtkiAlanlari[nitelik].elementAt(point.OzNitelikleri[nitelik]);
            int index = degerler.indexOf(sembol);
            if (index < 0) {
                degerler.addElement(sembol);
            }
        }
        int[] dizi = new int[degerler.size()];
        for (int i = 0; i < dizi.length; i++) {
            String symbol = (String) degerler.elementAt(i);
            dizi[i] = EtkiAlanlari[nitelik].indexOf(symbol);
        }
        degerler = null;
        return dizi;
    }

    public Vector AltKumeleriGetir(Vector veri, int nitelik, int deger) {
        Vector AltKume = new Vector();
        int say = veri.size();
        for (int i = 0; i < say; i++) {
            DataPoint point = (DataPoint) veri.elementAt(i);
            if (point.OzNitelikleri[nitelik] == deger) {
                AltKume.addElement(point);
            }
        }
        return AltKume;
    }

    public double DugumNoktalariniHesapla(Vector veri) {
        int VeriNumarasi = veri.size();
        if (VeriNumarasi == 0) {
            return 0;
        }
        int nitelik = OznitelikNumarasi - 1;
        int nitelikDegeri = EtkiAlanlari[nitelik].size();
        double topla = 0;
        for (int i = 0; i < nitelikDegeri; i++) {
            int sayac = 0;
            for (int j = 0; j < VeriNumarasi; j++) {
                DataPoint point = (DataPoint) veri.elementAt(j);
                if (point.OzNitelikleri[nitelik] == i) {
                    sayac++;
                }
            }
            double Olasilik = 1. * sayac / VeriNumarasi;
            if (sayac > 0) {
                topla += -Olasilik * Math.log(Olasilik);
            }
        }
        return topla;
    }

    public boolean AyristirmaIcinKullanilacak(TreeNode dugum, int nitelik) {
        if (dugum.AltDugum != null) {
            if (dugum.AyrismaOzniteligi == nitelik) {
                return true;
            }
        }
        if (dugum.UstDugum == null) {
            return false;
        }
        return AyristirmaIcinKullanilacak(dugum.UstDugum, nitelik);
    }

    public void AyristirmaDugumu(TreeNode dugum) {

        double EnIyiDugumNoktasi = 0;
        boolean secilen = false;
        int SecilenNitelik = 0;
        int VeriNumarasi = dugum.veri.size();
        int GirilenNiteliklerinNumarasi = OznitelikNumarasi - 1;
        dugum.DugunNoktalari = DugumNoktalariniHesapla(dugum.veri);
        if (dugum.DugunNoktalari == 0) {
            return;
        }
        for (int i = 0; i < GirilenNiteliklerinNumarasi; i++) {
            int DegerNumarasi = EtkiAlanlari[i].size();
            if (AyristirmaIcinKullanilacak(dugum, i)) {
                continue;
            }
            double OrtalamaDugumNoktasi = 0;
            for (int j = 0; j < DegerNumarasi; j++) {
                Vector AltKume = AltKumeleriGetir(dugum.veri, i, j);
                if (AltKume.size() == 0) {
                    continue;
                }
                double AltDugumNoktasi = DugumNoktalariniHesapla(AltKume);
                OrtalamaDugumNoktasi += AltDugumNoktasi * AltKume.size();
            }
            OrtalamaDugumNoktasi = OrtalamaDugumNoktasi / VeriNumarasi;
            if (secilen == false) {
                secilen = true;
                EnIyiDugumNoktasi = OrtalamaDugumNoktasi;
                SecilenNitelik = i;
            } else {
                if (OrtalamaDugumNoktasi < EnIyiDugumNoktasi) {
                    secilen = true;
                    EnIyiDugumNoktasi = OrtalamaDugumNoktasi;
                    SecilenNitelik = i;
                }
            }
        }
        if (secilen == false) {
            return;
        }
        int DegerNumarasi = EtkiAlanlari[SecilenNitelik].size();
        dugum.AyrismaOzniteligi = SecilenNitelik;
        dugum.AltDugum = new TreeNode[DegerNumarasi];
        for (int j = 0; j < DegerNumarasi; j++) {
            dugum.AltDugum[j] = new TreeNode();
            dugum.AltDugum[j].UstDugum = dugum;
            dugum.AltDugum[j].veri = AltKumeleriGetir(dugum.veri, SecilenNitelik, j);
            dugum.AltDugum[j].AyrismaDegeri = j;
        }

        for (int j = 0; j < DegerNumarasi; j++) {
            AyristirmaDugumu(dugum.AltDugum[j]);
        }

        dugum.veri = null;
    }

    public int VerileriOkuma(ArrayList<values.id3Values> list) throws Exception {
        database db = new database();

        EtkiAlanlari = new Vector[OznitelikNumarasi];
        for (int i = 0; i < OznitelikNumarasi; i++) {
            EtkiAlanlari[i] = new Vector();
        }
        OznitelikIsimleri = new String[OznitelikNumarasi];

        for (int i = 0; i < OznitelikNumarasi; i++) {
            OznitelikIsimleri[i] = "val" + (i + 1);
        }
        for (values.id3Values a : list) {
            DataPoint point = new DataPoint(OznitelikNumarasi);
            point.OzNitelikleri[0] = SembolDegeriniGetir(0, a.getVal1());
            point.OzNitelikleri[1] = SembolDegeriniGetir(1, a.getVal2());
            point.OzNitelikleri[2] = SembolDegeriniGetir(2, a.getVal3());
            point.OzNitelikleri[3] = SembolDegeriniGetir(3, a.getVal4());
            point.OzNitelikleri[4] = SembolDegeriniGetir(4, a.getVal5());

            kok.veri.addElement(point);
        }

        return 1;
    }

    public int kontrol(String oznitelikIsmi, String etkiAlanlari, String val1, String val2, String val3, String val4, id3Values values) {
        if (oznitelikIsmi.equals("val1") && etkiAlanlari.equals(val1)) {
            values.setVal1(val1);
        } else if (oznitelikIsmi.equals("val2") && etkiAlanlari.equals(val2)) {
            values.setVal2(val2);
        } else if (oznitelikIsmi.equals("val3") && etkiAlanlari.equals(val3)) {
            values.setVal3(val3);
        } else if (oznitelikIsmi.equals("val4") && etkiAlanlari.equals(val4)) {
            values.setVal4(val4);
        }
        return 0;
    }

    public id3Values kontrol2(String oznitelikIsmi, String etkiAlanlari, id3Values values) {
        id3Values valbuffer = new id3Values(values.getVal1(),values.getVal2(),values.getVal3(),values.getVal4(),"");
//  if (!values.getVal1().equals("") &&!values.getVal2().equals("") &&  !values.getVal3().equals("") && !values.getVal4().equals("")  )
        //     values = new id3Values();
        if (oznitelikIsmi.equals("val1")) {
            valbuffer.setVal1(etkiAlanlari);
        } else if (oznitelikIsmi.equals("val2")) {
             valbuffer.setVal2(etkiAlanlari);
        } else if (oznitelikIsmi.equals("val3")) {
             valbuffer.setVal3(etkiAlanlari);
        } else if (oznitelikIsmi.equals("val4")) {
             valbuffer.setVal4(etkiAlanlari);
        }
        return valbuffer;
    }

    public void AgaciYazdirma(TreeNode dugum, String sekme) {
        int DegeriDisariAlmakIcin = OznitelikNumarasi - 1;
        if (dugum.AltDugum == null) {
            int[] degerler = ButunDegerleriGetir(dugum.veri, DegeriDisariAlmakIcin);
            if (degerler.length == 1) {
                System.out.println(sekme + "\t" + OznitelikIsimleri[DegeriDisariAlmakIcin] + " = \"" + EtkiAlanlari[DegeriDisariAlmakIcin].elementAt(degerler[0]) + "\";");
                return;
            }
            System.out.print(sekme + "\t" + OznitelikIsimleri[DegeriDisariAlmakIcin] + " = {");
            for (int i = 0; i < degerler.length; i++) {
                System.out.print("\"" + EtkiAlanlari[DegeriDisariAlmakIcin].elementAt(degerler[i]) + "\" ");
                if (i != degerler.length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println(" };");
            return;
        }
        int DegerNumarasi = dugum.AltDugum.length;
        for (int i = 0; i < DegerNumarasi; i++) {
            System.out.println(sekme + "if( " + OznitelikIsimleri[dugum.AyrismaOzniteligi] + " == \"" + EtkiAlanlari[dugum.AyrismaOzniteligi].elementAt(i) + "\") {");
            AgaciYazdirma(dugum.AltDugum[i], sekme + "\t");
            if (i != DegerNumarasi - 1) {
                System.out.print(sekme + "} else ");
            } else {
                System.out.println(sekme + "}");
            }
        }
    }
    public ArrayList<id3Values> AgaciYazdirma(TreeNode dugum, String sekme, id3Values value) {

        int DegeriDisariAlmakIcin = OznitelikNumarasi - 1;
        if (dugum.AltDugum == null) {
            int oldCounter = counter;
            int[] degerler = ButunDegerleriGetir(dugum.veri, DegeriDisariAlmakIcin);
            if (degerler.length == 1) {
                value.setVal5(EtkiAlanlari[DegeriDisariAlmakIcin].elementAt(degerler[0]).toString());
                donenDegerArray.add(value);
                return donenDegerArray;
            }
            String deneme = "";
            boolean kosul2 = false;
            for (int i = 0; i < degerler.length; i++) {
                deneme += EtkiAlanlari[DegeriDisariAlmakIcin].elementAt(degerler[i]).toString();
                if (i != degerler.length - 1) {
                    deneme += " , ";
                    kosul2 = true;
                }
            }
            value.setVal5(deneme);
                donenDegerArray.add(value);
            return donenDegerArray;
        }
        int DegerNumarasi = dugum.AltDugum.length;
        for (int i = 0; i < DegerNumarasi; i++) {
            value = kontrol2(OznitelikIsimleri[dugum.AyrismaOzniteligi], EtkiAlanlari[dugum.AyrismaOzniteligi].elementAt(i).toString(), value);
            AgaciYazdirma(dugum.AltDugum[i], sekme + "\t", value);
        }

        return donenDegerArray;
    }

    public ArrayList<id3Values> KararAgaciOlusturma() {
        AyristirmaDugumu(kok);
        id3Values id = new id3Values();
        ArrayList<id3Values> deger = AgaciYazdirma(kok, "", id);
     //   AgaciYazdirma(kok, "");
        return deger;
    }

    public ArrayList<id3Values> main(ArrayList<values.id3Values> list) throws Exception {
        ArrayList<id3Values> a = new ArrayList<>();
        ID3 Id3Sinifimiz = new ID3();
        long BaslamaZamani = System.currentTimeMillis();
        int durum = Id3Sinifimiz.VerileriOkuma(list);
        if (durum <= 0) {
            return a;
        }
        a = Id3Sinifimiz.KararAgaciOlusturma();
        long BitisZamani = System.currentTimeMillis();
        long ToplamSure = (BitisZamani - BaslamaZamani) / 1000;
        System.out.println(ToplamSure + " Seconds");
        return a;
    }
}
