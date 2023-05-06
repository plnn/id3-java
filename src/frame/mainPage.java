/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import ID3.ID3;
import dbProcess.database;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import values.Common;
import values.id3Values;

/**
 *
 * @author dst1
 */
public class mainPage extends javax.swing.JFrame {

        ArrayList<String> array2 = new ArrayList<String>();
    /**
     * Creates new form mainPage
     */
    public mainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        combobox2 = new javax.swing.JComboBox();
        combobox3 = new javax.swing.JComboBox();
        combobox5 = new javax.swing.JComboBox();
        combobox1 = new javax.swing.JComboBox();
        combobox4 = new javax.swing.JComboBox();
        labelDeger = new javax.swing.JLabel();
        buttonRun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboDeger1 = new javax.swing.JComboBox();
        comboDeger2 = new javax.swing.JComboBox();
        comboDeger3 = new javax.swing.JComboBox();
        comboDeger4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("STATİK VERİ SORGULAMA", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("DİNAMİK VERİ SORGULAMA", jPanel2);

        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bölge Adı", "Şube Adı", "Müşteri Profili", "Sektör Kodu", "Sektör Adı", "Müşteri Segment Adı", "Rating Notu", "borca düşme olasılığı", "Rating Geçerlilik Tarihi", "Karar Tarihi", "vergi toplam", "Toplam Limiti", "Limiti Blokeli mi?", "Nakdi Toplam Risk", "Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)", "Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)", "Kurumsal Toplam Risk (TL)", "Bireysel Toplam Risk (TL)", "Kredi Kartı Toplam Risk (TL)", "Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)", "Kart Borcu Gecikme Tutarı (TL)", "Toplam Tahsilat (Son 1 Yıl ) (TL)", "Max Gecikme Gün (Son 1 Yıl)", "Toplam Tahsilat (Son 1 Ay ) (TL)", "Son Dönem Ödenmemiş Kredi Limit", "Önceki Dönem Ödenmemiş Kredi Limit", "Son Dönem Risk Toplamı (TL)", "Bir Önceki Dönem RiskToplamı (TL)", "Bir Önceki Dönem Vergi Borcu Toplamı (TL)", "Son Dönem Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Nakti Risk Toplamı (TL)", "Son Dönem Gayri Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)", "Son Dönem Limit Doluluk Oranı", "Bir Önceki Dönem Limit Doluluk Oranı", "Teminata Verdiği Çek TL", "Teminata Verdiği Çek Sonuç", "Teminata Alınmış Çeklerin Tahsil Oranı", "1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)", "bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "Erken Uyarı Notu Var mı?", "Grup Ekren Uyarı Notu Var mı?", "Müşteri No", "Uzman Değerlendirmesi" }));
        combobox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox2ItemStateChanged(evt);
            }
        });

        combobox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bölge Adı", "Şube Adı", "Müşteri Profili", "Sektör Kodu", "Sektör Adı", "Müşteri Segment Adı", "Rating Notu", "borca düşme olasılığı", "Rating Geçerlilik Tarihi", "Karar Tarihi", "vergi toplam", "Toplam Limiti", "Limiti Blokeli mi?", "Nakdi Toplam Risk", "Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)", "Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)", "Kurumsal Toplam Risk (TL)", "Bireysel Toplam Risk (TL)", "Kredi Kartı Toplam Risk (TL)", "Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)", "Kart Borcu Gecikme Tutarı (TL)", "Toplam Tahsilat (Son 1 Yıl ) (TL)", "Max Gecikme Gün (Son 1 Yıl)", "Toplam Tahsilat (Son 1 Ay ) (TL)", "Son Dönem Ödenmemiş Kredi Limit", "Önceki Dönem Ödenmemiş Kredi Limit", "Son Dönem Risk Toplamı (TL)", "Bir Önceki Dönem RiskToplamı (TL)", "Bir Önceki Dönem Vergi Borcu Toplamı (TL)", "Son Dönem Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Nakti Risk Toplamı (TL)", "Son Dönem Gayri Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)", "Son Dönem Limit Doluluk Oranı", "Bir Önceki Dönem Limit Doluluk Oranı", "Teminata Verdiği Çek TL", "Teminata Verdiği Çek Sonuç", "Teminata Alınmış Çeklerin Tahsil Oranı", "1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)", "bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "Erken Uyarı Notu Var mı?", "Grup Ekren Uyarı Notu Var mı?", "Müşteri No", "Uzman Değerlendirmesi" }));
        combobox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox3ItemStateChanged(evt);
            }
        });

        combobox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bölge Adı", "Şube Adı", "Müşteri Profili", "Sektör Kodu", "Sektör Adı", "Müşteri Segment Adı", "Rating Notu", "borca düşme olasılığı", "Rating Geçerlilik Tarihi", "Karar Tarihi", "vergi toplam", "Toplam Limiti", "Limiti Blokeli mi?", "Nakdi Toplam Risk", "Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)", "Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)", "Kurumsal Toplam Risk (TL)", "Bireysel Toplam Risk (TL)", "Kredi Kartı Toplam Risk (TL)", "Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)", "Kart Borcu Gecikme Tutarı (TL)", "Toplam Tahsilat (Son 1 Yıl ) (TL)", "Max Gecikme Gün (Son 1 Yıl)", "Toplam Tahsilat (Son 1 Ay ) (TL)", "Son Dönem Ödenmemiş Kredi Limit", "Önceki Dönem Ödenmemiş Kredi Limit", "Son Dönem Risk Toplamı (TL)", "Bir Önceki Dönem RiskToplamı (TL)", "Bir Önceki Dönem Vergi Borcu Toplamı (TL)", "Son Dönem Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Nakti Risk Toplamı (TL)", "Son Dönem Gayri Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)", "Son Dönem Limit Doluluk Oranı", "Bir Önceki Dönem Limit Doluluk Oranı", "Teminata Verdiği Çek TL", "Teminata Verdiği Çek Sonuç", "Teminata Alınmış Çeklerin Tahsil Oranı", "1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)", "bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "Erken Uyarı Notu Var mı?", "Grup Ekren Uyarı Notu Var mı?", "Müşteri No", "Uzman Değerlendirmesi" }));

        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bölge Adı", "Şube Adı", "Müşteri Profili", "Sektör Kodu", "Sektör Adı", "Müşteri Segment Adı", "Rating Notu", "borca düşme olasılığı", "Rating Geçerlilik Tarihi", "Karar Tarihi", "vergi toplam", "Toplam Limiti", "Limiti Blokeli mi?", "Nakdi Toplam Risk", "Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)", "Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)", "Kurumsal Toplam Risk (TL)", "Bireysel Toplam Risk (TL)", "Kredi Kartı Toplam Risk (TL)", "Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)", "Kart Borcu Gecikme Tutarı (TL)", "Toplam Tahsilat (Son 1 Yıl ) (TL)", "Max Gecikme Gün (Son 1 Yıl)", "Toplam Tahsilat (Son 1 Ay ) (TL)", "Son Dönem Ödenmemiş Kredi Limit", "Önceki Dönem Ödenmemiş Kredi Limit", "Son Dönem Risk Toplamı (TL)", "Bir Önceki Dönem RiskToplamı (TL)", "Bir Önceki Dönem Vergi Borcu Toplamı (TL)", "Son Dönem Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Nakti Risk Toplamı (TL)", "Son Dönem Gayri Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)", "Son Dönem Limit Doluluk Oranı", "Bir Önceki Dönem Limit Doluluk Oranı", "Teminata Verdiği Çek TL", "Teminata Verdiği Çek Sonuç", "Teminata Alınmış Çeklerin Tahsil Oranı", "1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)", "bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "Erken Uyarı Notu Var mı?", "Grup Ekren Uyarı Notu Var mı?", "Müşteri No", "Uzman Değerlendirmesi" }));
        combobox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox1ItemStateChanged(evt);
            }
        });
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });

        combobox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bölge Adı", "Şube Adı", "Müşteri Profili", "Sektör Kodu", "Sektör Adı", "Müşteri Segment Adı", "Rating Notu", "borca düşme olasılığı", "Rating Geçerlilik Tarihi", "Karar Tarihi", "vergi toplam", "Toplam Limiti", "Limiti Blokeli mi?", "Nakdi Toplam Risk", "Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)", "Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)", "Kurumsal Toplam Risk (TL)", "Bireysel Toplam Risk (TL)", "Kredi Kartı Toplam Risk (TL)", "Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)", "Kart Borcu Gecikme Tutarı (TL)", "Toplam Tahsilat (Son 1 Yıl ) (TL)", "Max Gecikme Gün (Son 1 Yıl)", "Toplam Tahsilat (Son 1 Ay ) (TL)", "Son Dönem Ödenmemiş Kredi Limit", "Önceki Dönem Ödenmemiş Kredi Limit", "Son Dönem Risk Toplamı (TL)", "Bir Önceki Dönem RiskToplamı (TL)", "Bir Önceki Dönem Vergi Borcu Toplamı (TL)", "Son Dönem Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Nakti Risk Toplamı (TL)", "Son Dönem Gayri Nakti Risk Toplamı (TL)", "Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)", "Son Dönem Limit Doluluk Oranı", "Bir Önceki Dönem Limit Doluluk Oranı", "Teminata Verdiği Çek TL", "Teminata Verdiği Çek Sonuç", "Teminata Alınmış Çeklerin Tahsil Oranı", "1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)", "bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)", "Erken Uyarı Notu Var mı?", "Grup Ekren Uyarı Notu Var mı?", "Müşteri No", "Uzman Değerlendirmesi" }));
        combobox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox4ItemStateChanged(evt);
            }
        });
        combobox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox4ActionPerformed(evt);
            }
        });

        labelDeger.setText("Sonuc : ");

        buttonRun.setText("AĞACI OLUŞTUR");
        buttonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunActionPerformed(evt);
            }
        });

        jLabel1.setText("Değer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(buttonRun)))
                        .addGap(51, 51, 51)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDeger)
                    .addComponent(comboDeger1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDeger4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDeger))
                .addGap(37, 37, 37)
                .addComponent(buttonRun)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("KARAR AĞACI OLUŞTURMA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunActionPerformed
        
        Common cm = new Common();
        String comboVal1 = cm.dbValue(combobox1.getSelectedItem().toString());                                      
        String comboVal2 = cm.dbValue(combobox2.getSelectedItem().toString());                                      
        String comboVal3 = cm.dbValue(combobox3.getSelectedItem().toString());                                      
        String comboVal4 = cm.dbValue(combobox4.getSelectedItem().toString());                                    
        String comboVal5 = cm.dbValue(combobox5.getSelectedItem().toString());                                
//        String comboVal6 = combobox6.getSelectedItem().toString();
        
        database db = new database();
        ArrayList<values.id3Values> array = null;
        try {
            array = db.getDataOnly5(comboVal1,comboVal2,comboVal3,comboVal4,comboVal5);
        } catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        ID3 id3 = new ID3();
        try {
            String val1 = comboDeger1.getSelectedItem().toString();
            String val2 = comboDeger2.getSelectedItem().toString();
            String val3 = comboDeger3.getSelectedItem().toString();
            String val4 = comboDeger4.getSelectedItem().toString();
            ArrayList<id3Values> deger = id3.main(array);
            String text = degerBul(deger, val1, val2, val3, val4);
            labelDeger.setText("Sonuc :   "+ text);
            //labelDeger.setText(deger);
        } catch (Exception ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRunActionPerformed
public String degerBul (ArrayList<id3Values> val,String val1,String val2,String val3,String val4){
     String deger = "";
     int counter = 0;
     for (id3Values a : val){
         int buffercounter = 0;
         if (a.getVal1().equals(val1)){ buffercounter++;}
         if (a.getVal2().equals(val2)){  buffercounter++;}
         if (a.getVal3().equals(val3)){  buffercounter++;}
         if (a.getVal4().equals(val4)){ buffercounter++;}
         if (buffercounter>=counter){
              deger = a.getVal5();
              counter = buffercounter;
         }
     }
     if(deger.indexOf(",")>-1)
        return deger.substring(0,deger.indexOf(","));
     else return deger;
}
    private void combobox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox4ItemStateChanged
String comboVal = combobox4.getSelectedItem().toString();
        Common cm = new Common();
        String dbVal = cm.dbValue(comboVal);
        database db = new database();
        ArrayList<values.id3Values> array = null;
        try {
            array = db.getDataOnly1(dbVal);
        } catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (array != null){
            comboDeger4.removeAllItems();
            for (values.id3Values a : array){
                comboDeger4.addItem(a.getVal1());
            }
        }   
    }//GEN-LAST:event_combobox4ItemStateChanged

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1ActionPerformed

    private void combobox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox4ActionPerformed

    private void combobox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox1ItemStateChanged
        
        String comboVal = combobox1.getSelectedItem().toString();
        Common cm = new Common();
        String dbVal = cm.dbValue(comboVal);
        database db = new database();
        ArrayList<values.id3Values> array = null;
        try {
            array = db.getDataOnly1(dbVal);
        } catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (array != null){
            comboDeger1.removeAllItems();
            for (values.id3Values a : array){
                comboDeger1.addItem(a.getVal1());
            }
        }   
       
    }//GEN-LAST:event_combobox1ItemStateChanged

    private void combobox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox2ItemStateChanged
        String comboVal = combobox2.getSelectedItem().toString();
        Common cm = new Common();
        String dbVal = cm.dbValue(comboVal);
        database db = new database();
        ArrayList<values.id3Values> array = null;
        try {
            array = db.getDataOnly1(dbVal);
        } catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (array != null){
            comboDeger2.removeAllItems();
            for (values.id3Values a : array){
                comboDeger2.addItem(a.getVal1());
            }
        }   
    }//GEN-LAST:event_combobox2ItemStateChanged

    private void combobox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox3ItemStateChanged
        String comboVal = combobox3.getSelectedItem().toString();
        Common cm = new Common();
        String dbVal = cm.dbValue(comboVal);
        database db = new database();
        ArrayList<values.id3Values> array = null;
        try {
            array = db.getDataOnly1(dbVal);
        } catch (SQLException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (array != null){
            comboDeger3.removeAllItems();
            for (values.id3Values a : array){
                comboDeger3.addItem(a.getVal1());
            }
        }   
    }//GEN-LAST:event_combobox3ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRun;
    private javax.swing.JComboBox comboDeger1;
    private javax.swing.JComboBox comboDeger2;
    private javax.swing.JComboBox comboDeger3;
    private javax.swing.JComboBox comboDeger4;
    private javax.swing.JComboBox combobox1;
    private javax.swing.JComboBox combobox2;
    private javax.swing.JComboBox combobox3;
    private javax.swing.JComboBox combobox4;
    private javax.swing.JComboBox combobox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel labelDeger;
    // End of variables declaration//GEN-END:variables
}
