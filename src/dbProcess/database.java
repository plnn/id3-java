/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import values.id3Values;
import values.values;

/**
 *
 * @author dst1
 */
public class database {

    Connection con;
    private String selectAll = "select BOLGE_ADI,SUBE_ADI,MUSTERI_PROFILI,SEKTOR_KODU,SEKTOR_ADI,MUSTERI_SEGMENT_ADI,RATING_NOTU,BORCA_DUSME_OLASILIGI,RATING_GECERLILIK_TARIHI,KARAR_TARIHI,VERGI_TOPLAM,TOPLAM_LIMIT,LIMITI_BLOKE_MI,NAKTI_TOPLAM_RISK,KURUMSAL_GAYRINAKDI_TOPLAM_ANA_PARA_RISK,BIREYSEL_VE_KURUMSAL_VE_KREDI_KARTI_RISK_TOPLAM,KURUMSAL_TOPLAM_RISK,BIREYSEL_TOPLAM_RISK,KREDI_KARTI_TOPLAM_RISK,KREDI_BORCU_ODEME_GUN,KART_BORCU_GECIKME_TUTARI,TOPLAM_TAHSILAT_YIL,MAX_GECIKME_GUN,TOPLAM_TAHSILAT_AY,SON_DONEM_ODENMEMIS_KREDI_LIMITI,ONCEKI_DONEM_ODENMEMIS_KREDI_LIMITI,SON_DONEM_RISK_TOPLAMI,BIR_ONCEKI_DONEM_RISK_TOPLAMI,BIR_ONCEKI_DONEM_VERGI_BORCU,SON_DONEM_NAKDI_RISK_TOPLAMI,BIR_ONCEKI_DONEM_NAKTI_RISK_TOPLAMI,SON_DONEM_GAYRI_NAKTI_RISK_TOPLAMI,BIR_ONCEKI_GAYRI_NAKTI_RISK_TOPLAMI,SON_DONEM_LIMIT_DOLULUK_ORANI,BIR_ONCEKI_DONEM_LIMIT_DOLULUK_ORANI,TEMINATA_VERDIGI_CEK_TL,TEMINATA_VERDIGI_CEK_SONUC,TEMINATA_ALINMIS_CEKLERIN_TAHSIL_ORANI,BIR_YIL_ONCESI_KARSICILIKSIZ_CEK_KAYDI_VAR_MI,BIR_YIL_ONCESI_ICRA_KAYDI_VAR_MI,BU_YIL_KARSICILIKSIZ_CEK_KAYDI_VAR_MI,ERKEN_UYARI_NOTU_VAR_MI,GRUP_EKREN_UYATI_NOTU_VARMII,MUSTERI_NO,UZMAN_DEGERLENDIRMESI from DATA ";
 
    private static String tableName = "restaurants";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;
    public Connection getConnection() {
        try {
            
            String aa = "jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS;databaseName=DATADB;user=test;password=test";
            String ss = "jdbc:derby://localhost:1527/DATADB;user=sa;password=sadmin";
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(ss); 
           /*    
            Class driverClass = Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Driver driver2 = (Driver) driverClass.newInstance();
            DriverManager.registerDriver(driver2);
            con = DriverManager.getConnection(aa);
            con.setAutoCommit(true);
            con.setReadOnly(false);*/
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.err.print("Exception: ");
            System.err.println(ex.getMessage());
        }
        return conn;
    }

    public  ArrayList<values> getData() throws SQLException {
        ArrayList<values> list = new ArrayList<>();
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectAll);
        while (rs.next()) {
            String BOLGE_ADI = rs.getString("BOLGE_ADI");
            String SUBE_ADI = rs.getString("SUBE_ADI");
            String MUSTERI_PROFILI = rs.getString("MUSTERI_PROFILI");
            String SEKTOR_KODU = rs.getString("SEKTOR_KODU");
            String SEKTOR_ADI = rs.getString("SEKTOR_ADI");
            String MUSTERI_SEGMENT_ADI = rs.getString("MUSTERI_SEGMENT_ADI");
            String RATING_NOTU = rs.getString("RATING_NOTU");
            String BORCA_DUSME_OLASILIGI = rs.getString("BORCA_DUSME_OLASILIGI ");
            String RATING_GECERLILIK_TARIHI = rs.getString("RATING_GECERLILIK_TARIHI");
            String KARAR_TARIHI = rs.getString("KARAR_TARIHI");
            String VERGI_TOPLAM = rs.getString("VERGI_TOPLAM");
            String TOPLAM_LIMIT = rs.getString("TOPLAM_LIMIT");
            String LIMITI_BLOKE_MI = rs.getString("LIMITI_BLOKE_MI");
            String NAKTI_TOPLAM_RISK = rs.getString("NAKTI_TOPLAM_RISK");
            String KURUMSAL_GAYRINAKDI_TOPLAM_ANA_PARA_RISK = rs.getString("KURUMSAL_GAYRINAKDI_TOPLAM_ANA_PARA_RISK");
            String BIREYSEL_VE_KURUMSAL_VE_KREDI_KARTI_RISK_TOPLAM = rs.getString("BIREYSEL_VE_KURUMSAL_VE_KREDI_KARTI_RISK_TOPLAM");
            String KURUMSAL_TOPLAM_RISK = rs.getString("KURUMSAL_TOPLAM_RISK");
            String BIREYSEL_TOPLAM_RISK = rs.getString("BIREYSEL_TOPLAM_RISK");
            String KREDI_KARTI_TOPLAM_RISK = rs.getString("KREDI_KARTI_TOPLAM_RISK");
            String KREDI_BORCU_ODEME_GUN = rs.getString("KREDI_BORCU_ODEME_GUN");
            String KART_BORCU_GECIKME_TUTARI = rs.getString("KART_BORCU_GECIKME_TUTARI");
            String TOPLAM_TAHSILAT_YIL = rs.getString("TOPLAM_TAHSILAT_YIL");
            String MAX_GECIKME_GUN = rs.getString("MAX_GECIKME_GUN");
            String TOPLAM_TAHSILAT_AY = rs.getString("TOPLAM_TAHSILAT_AY");
            String SON_DONEM_ODENMEMIS_KREDI_LIMITI = rs.getString("SON_DONEM_ODENMEMIS_KREDI_LIMITI");
            String ONCEKI_DONEM_ODENMEMIS_KREDI_LIMITI = rs.getString("ONCEKI_DONEM_ODENMEMIS_KREDI_LIMITI");
            String SON_DONEM_RISK_TOPLAMI = rs.getString("SON_DONEM_RISK_TOPLAMI");
            String BIR_ONCEKI_DONEM_RISK_TOPLAMI = rs.getString("BIR_ONCEKI_DONEM_RISK_TOPLAMI");
            String BIR_ONCEKI_DONEM_VERGI_BORCU = rs.getString("BIR_ONCEKI_DONEM_VERGI_BORCU");
            String SON_DONEM_NAKDI_RISK_TOPLAMI = rs.getString("SON_DONEM_NAKDI_RISK_TOPLAMI");
            String BIR_ONCEKI_DONEM_NAKTI_RISK_TOPLAMI = rs.getString("BIR_ONCEKI_DONEM_NAKTI_RISK_TOPLAMI");
            String SON_DONEM_GAYRI_NAKTI_RISK_TOPLAMI = rs.getString("SON_DONEM_GAYRI_NAKTI_RISK_TOPLAMI");
            String BIR_ONCEKI_GAYRI_NAKTI_RISK_TOPLAMI = rs.getString("BIR_ONCEKI_GAYRI_NAKTI_RISK_TOPLAMI");
            String SON_DONEM_LIMIT_DOLULUK_ORANI = rs.getString("SON_DONEM_LIMIT_DOLULUK_ORANI");
            String BIR_ONCEKI_DONEM_LIMIT_DOLULUK_ORANI = rs.getString("BIR_ONCEKI_DONEM_LIMIT_DOLULUK_ORANI");
            String TEMINATA_VERDIGI_CEK_TL = rs.getString("TEMINATA_VERDIGI_CEK_TL");
            String TEMINATA_VERDIGI_CEK_SONUC = rs.getString("TEMINATA_VERDIGI_CEK_SONUC");
            String TEMINATA_ALINMIS_CEKLERIN_TAHSIL_ORANI = rs.getString("TEMINATA_ALINMIS_CEKLERIN_TAHSIL_ORANI");
            String BIR_YIL_ONCESI_KARSICILIKSIZ_CEK_KAYDI_VAR_MI = rs.getString("BIR_YIL_ONCESI_KARSICILIKSIZ_CEK_KAYDI_VAR_MI");
            String BIR_YIL_ONCESI_ICRA_KAYDI_VAR_MI = rs.getString("BIR_YIL_ONCESI_ICRA_KAYDI_VAR_MI");
            String BU_YIL_KARSICILIKSIZ_CEK_KAYDI_VAR_MI = rs.getString("BU_YIL_KARSICILIKSIZ_CEK_KAYDI_VAR_MI");
            String ERKEN_UYARI_NOTU_VAR_MI = rs.getString("ERKEN_UYARI_NOTU_VAR_MI");
            String GRUP_EKREN_UYATI_NOTU_VARMII = rs.getString("GRUP_EKREN_UYATI_NOTU_VARMII");
            String MUSTERI_NO = rs.getString("MUSTERI_NO");
            String UZMAN_DEGERLENDIRMESI = rs.getString("UZMAN_DEGERLENDIRMESI");
            values v = new values(BOLGE_ADI, SUBE_ADI, MUSTERI_PROFILI, SEKTOR_KODU, SEKTOR_ADI, MUSTERI_SEGMENT_ADI, RATING_NOTU, BORCA_DUSME_OLASILIGI, RATING_GECERLILIK_TARIHI, KARAR_TARIHI, VERGI_TOPLAM, LIMITI_BLOKE_MI, NAKTI_TOPLAM_RISK, KURUMSAL_GAYRINAKDI_TOPLAM_ANA_PARA_RISK, BIREYSEL_VE_KURUMSAL_VE_KREDI_KARTI_RISK_TOPLAM, KURUMSAL_TOPLAM_RISK, BIREYSEL_TOPLAM_RISK, KREDI_KARTI_TOPLAM_RISK, KREDI_BORCU_ODEME_GUN, KART_BORCU_GECIKME_TUTARI, TOPLAM_TAHSILAT_YIL, MAX_GECIKME_GUN, TOPLAM_TAHSILAT_AY, SON_DONEM_ODENMEMIS_KREDI_LIMITI, ONCEKI_DONEM_ODENMEMIS_KREDI_LIMITI, SON_DONEM_RISK_TOPLAMI, BIR_ONCEKI_DONEM_RISK_TOPLAMI, BIR_ONCEKI_DONEM_VERGI_BORCU, SON_DONEM_NAKDI_RISK_TOPLAMI, BIR_ONCEKI_DONEM_NAKTI_RISK_TOPLAMI, SON_DONEM_GAYRI_NAKTI_RISK_TOPLAMI, BIR_ONCEKI_GAYRI_NAKTI_RISK_TOPLAMI, SON_DONEM_LIMIT_DOLULUK_ORANI, BIR_ONCEKI_DONEM_LIMIT_DOLULUK_ORANI, TEMINATA_VERDIGI_CEK_TL, TEMINATA_VERDIGI_CEK_SONUC, TEMINATA_ALINMIS_CEKLERIN_TAHSIL_ORANI, BIR_YIL_ONCESI_KARSICILIKSIZ_CEK_KAYDI_VAR_MI, BIR_YIL_ONCESI_ICRA_KAYDI_VAR_MI, BU_YIL_KARSICILIKSIZ_CEK_KAYDI_VAR_MI, ERKEN_UYARI_NOTU_VAR_MI, GRUP_EKREN_UYATI_NOTU_VARMII, MUSTERI_NO, UZMAN_DEGERLENDIRMESI, TOPLAM_LIMIT);
            list.add(v);
        }
        conn.close();
        return list;

    }
public  ArrayList<id3Values> getDataOnly5(String val1,String val2, String val3, String val4, String val5) throws SQLException {
        ArrayList<id3Values> list = new ArrayList<>();
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
            String query = "Select  "+ val1+"," +val2 +"," +val3+"," +val4+"," +val5+ " from DATA";
        ResultSet rs = stmt.executeQuery(selectAll);
        while (rs.next()) {
            String v1 = rs.getString(val1);
            String v2 = rs.getString(val2);
            String v3 = rs.getString(val3);
            String v4 = rs.getString(val4);
            String v5 = rs.getString(val5);
            id3Values v = new id3Values(v1,v2,v3,v4,v5);
            list.add(v);
        }
        conn.close();
        return list;

    }
public  ArrayList<id3Values> getDataOnly1(String val) throws SQLException {
        ArrayList<id3Values> list = new ArrayList<>();
        try (Connection conn = getConnection()) {
            Statement stmt = conn.createStatement();
            String query = "Select distinct "+ val + " from DATA";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String v1 = rs.getString(val);
                id3Values v = new id3Values(v1,"","","","");
                list.add(v);
            }
        }
        return list;

    }
}
