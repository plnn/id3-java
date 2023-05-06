/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values;

/**
 *
 * @author dst1
 */
public class Common {
    
    public String dbValue (String comboVal){
        String val = "";
        if (comboVal.equals("Bölge Adı"))
            val = "BOLGE_ADI";
        if (comboVal.equals("Şube Adı"))
            val = "SUBE_ADI";
        if (comboVal.equals("Müşteri Profili"))
            val = "MUSTERI_PROFILI";
        if (comboVal.equals("Sektör Kodu"))
            val = "SEKTOR_KODU";
        if (comboVal.equals("Sektör Adı"))
            val = "SEKTOR_ADI";
        if (comboVal.equals("Müşteri Segment Adı"))
            val = "MUSTERI_SEGMENT_ADI";
        if (comboVal.equals("Rating Notu"))
            val = "RATING_NOTU";
        if (comboVal.equals("borca düşme olasılığı"))
            val = "BORCA_DUSME_OLASILIGI";
        if (comboVal.equals("Rating Geçerlilik Tarihi"))
            val = "RATING_GECERLILIK_TARIHI";
        if (comboVal.equals("Karar Tarihi"))
            val = "KARAR_TARIHI";
        if (comboVal.equals("vergi toplam"))
            val = "VERGI_TOPLAM";
        if (comboVal.equals("Toplam Limiti"))
            val = "TOPLAM_LIMIT";
        if (comboVal.equals("Limiti Blokeli mi?"))
            val = "LIMITI_BLOKE_MI";
        if (comboVal.equals("Nakdi Toplam Risk"))
            val = "NAKTI_TOPLAM_RISK";
        if (comboVal.equals("Kurumsal Gayrinakdi Toplam Ana Para Risk (TL)"))
            val = "KURUMSAL_GAYRINAKDI_TOPLAM_ANA_PARA_RISK";
        if (comboVal.equals("Bireysel ve Kurumsal ve Kredi Kartı Risk Toplam (TL)"))
            val = "BIREYSEL_VE_KURUMSAL_VE_KREDI_KARTI_RISK_TOPLAM";
        if (comboVal.equals("Kurumsal Toplam Risk (TL)"))
            val = "KURUMSAL_TOPLAM_RISK";
        if (comboVal.equals("Bireysel Toplam Risk (TL)"))
            val = "BIREYSEL_TOPLAM_RISK";
        if (comboVal.equals("Kredi Kartı Toplam Risk (TL)"))
            val = "KREDI_KARTI_TOPLAM_RISK";
        if (comboVal.equals("Kart Borcu Ödene Gecikme Gün (Son 1 Yıl)"))
            val = "KREDI_BORCU_ODEME_GUN";
        if (comboVal.equals("Kart Borcu Gecikme Tutarı (TL)"))
            val = "KART_BORCU_GECIKME_TUTARI";
        if (comboVal.equals("Toplam Tahsilat (Son 1 Yıl ) (TL)"))
            val = "TOPLAM_TAHSILAT_YIL";
        if (comboVal.equals("Max Gecikme Gün (Son 1 Yıl)"))
            val = "MAX_GECIKME_GUN";
        if (comboVal.equals("Toplam Tahsilat (Son 1 Ay ) (TL)"))
            val = "TOPLAM_TAHSILAT_AY";
        if (comboVal.equals("Son Dönem Ödenmemiş Kredi Limit"))
            val = "SON_DONEM_ODENMEMIS_KREDI_LIMITI";
        if (comboVal.equals("Önceki Dönem Ödenmemiş Kredi Limit"))
            val = "ONCEKI_DONEM_ODENMEMIS_KREDI_LIMITI";
        if (comboVal.equals("Son Dönem Risk Toplamı (TL)"))
            val = "SON_DONEM_RISK_TOPLAMI";
        if (comboVal.equals("Bir Önceki Dönem RiskToplamı (TL)"))
            val = "BIR_ONCEKI_DONEM_RISK_TOPLAMI";
        if (comboVal.equals("Bir Önceki Dönem Vergi Borcu Toplamı (TL)"))
            val = "BIR_ONCEKI_DONEM_VERGI_BORCU";
        if (comboVal.equals("Son Dönem Nakti Risk Toplamı (TL)"))
            val = "SON_DONEM_NAKDI_RISK_TOPLAMI";
        if (comboVal.equals("Bir Önceki Dönem Nakti Risk Toplamı (TL)"))
            val = "BIR_ONCEKI_DONEM_NAKTI_RISK_TOPLAMI";
        if (comboVal.equals("Son Dönem Gayri Nakti Risk Toplamı (TL)"))
            val = "SON_DONEM_GAYRI_NAKTI_RISK_TOPLAMI";
        if (comboVal.equals("Bir Önceki Dönem Gayri Nakti Risk Toplamı (TL)"))
            val = "BIR_ONCEKI_GAYRI_NAKTI_RISK_TOPLAMI";
        if (comboVal.equals("Son Dönem Limit Doluluk Oranı"))
            val = "SON_DONEM_LIMIT_DOLULUK_ORANI";
        if (comboVal.equals("Bir Önceki Dönem Limit Doluluk Oranı"))
            val = "BIR_ONCEKI_DONEM_LIMIT_DOLULUK_ORANI";
        if (comboVal.equals("Teminata Verdiği Çek TL"))
            val = "TEMINATA_VERDIGI_CEK_TL";
        if (comboVal.equals("Teminata Verdiği Çek Sonuç"))
            val = "TEMINATA_VERDIGI_CEK_SONUC";
        if (comboVal.equals("Teminata Alınmış Çeklerin Tahsil Oranı"))
            val = "TEMINATA_ALINMIS_CEKLERIN_TAHSIL_ORANI";
        if (comboVal.equals("1 Yıl Öncesi Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)"))
            val = "BIR_YIL_ONCESI_KARSICILIKSIZ_CEK_KAYDI_VAR_MI";
        if (comboVal.equals("1 Yıl Öncesi İcra Kaydı Var mı? (Olumsuzluk)"))
            val = "BIR_YIL_ONCESI_ICRA_KAYDI_VAR_MI";
        if (comboVal.equals("bu Yıl Karşılıksız Çek Kaydı Var mı? (Olumsuzluk)"))
            val = "BU_YIL_KARSICILIKSIZ_CEK_KAYDI_VAR_MI";
        if (comboVal.equals("Erken Uyarı Notu Var mı?"))
            val = "ERKEN_UYARI_NOTU_VAR_MI";
        if (comboVal.equals("Grup Ekren Uyarı Notu Var mı?"))
            val = "GRUP_EKREN_UYATI_NOTU_VARMII";
        if (comboVal.equals("Müşteri No"))
            val = "MUSTERI_NO";
        if (comboVal.equals("Uzman Değerlendirmesi"))
            val = "UZMAN_DEGERLENDIRMESI";
        return val;
        
    }
}
