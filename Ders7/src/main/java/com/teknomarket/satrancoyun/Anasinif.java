package com.teknomarket.satrancoyun;

public class Anasinif {

    public static void main(String[] args) {
        System.out.println("AMA KAFAM NASI GÜZEL...");

        System.out.println("------------------------");
        System.out.println("CONSTRUCTOR VE PARAMETRELİ CONSTRUCTOR");
        System.out.println("------------------------");

        Ogrenci ogrenci1 = new Ogrenci();
        System.out.println("Öğrenci bilgileri: " + ogrenci1.adSoyad + "  " + ogrenci1.yas);

        ogrenci1.adSoyad = "Ali Desitero";
        System.out.println("Öğrenci bilgileri: " + ogrenci1.adSoyad + "  " + ogrenci1.yas);

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.adSoyad = "Ülkü Yılmaz";
        ogretmen1.brans = "Okul Öncesi";
        System.out.println("Öğretmen: " + ogretmen1.adSoyad + " - " + ogretmen1.brans);

        Ogretmen ogretmen2 = new Ogretmen("Tünzile Çorlak", "Matematik");
        System.out.println("Öğretmen: " + ogretmen2.adSoyad + " - " + ogretmen2.brans);


        System.out.println("------------------------");
        System.out.println("GARBAGE COLLECTION");
        System.out.println("------------------------");
        //Ogrenci ogrenci1 = new Ogrenci();
        //Ogrenci ogrenci2 = new Ogrenci();
        //Ogrenci ogrenci3 = new Ogrenci();
        //Ogrenci ogrenci4 = new Ogrenci();
        //Ogrenci ogrenci5 = new Ogrenci();
        //// ........
        //Ogrenci ogrenci1000 = new Ogrenci();
        /*
        for (int i = 0; i<100000000; i++) {
            Ogrenci ogrrr = new Ogrenci();
            System.out.println("ogrr: " + ogrrr);
        }
        */

        System.out.println("------------------------");
        System.out.println("INNER CLASS");
        System.out.println("------------------------");


        System.out.println("------------------------");
        System.out.println("ERİŞİM TİPLERİ");
        System.out.println("------------------------");
        KonuErisimTipleri konuErisimTipleri = new KonuErisimTipleri();
        konuErisimTipleri.adSoyad = "Serdar Ortaç";
        //konuErisimTipleri.dogumYeri = "sdfsdfsdf";
        konuErisimTipleri.ekranaYazdir();
        //konuErisimTipleri.falanFilanInterMilan();

        System.out.println("------------------------");
        System.out.println("STATIC / FINAL / CONST");
        System.out.println("------------------------");
        KonuStaticFinalConst k1 = new KonuStaticFinalConst();
        k1.adSoyad = "Demet Akalın";

        KonuStaticFinalConst k2 = new KonuStaticFinalConst();
        k2.adSoyad = "Nihat Doğan";

        KonuStaticFinalConst.ulke = "TR";

        System.out.println("Ad: " + k1.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);
        System.out.println("Ad: " + k2.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);

        KonuStaticFinalConst.ulke = "EN";
        k1.ulke = "FR";
        System.out.println("Ad: " + k1.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);
        System.out.println("Ad: " + k2.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);

        KonuStaticFinalConst.sirketAdiniYazdir();
        System.out.println("Ad: " + k1.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);
        System.out.println("Ad: " + k2.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);

        System.out.println("Gezegen: " + k1.gezegen);
        //k1.gezegen = "asdasda";

        //KonuStaticFinalConst.sirketAdi = "Loadium";
        System.out.println("Şirket: " + KonuStaticFinalConst.sirketAdi);
        System.out.println("Şirket: " + KonuStaticFinalConst.SIRKET_ADI);

    }

}
