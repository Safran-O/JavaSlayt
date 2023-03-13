package com.teknomarket.satrancoyun;

public class KonuStaticFinalConst {

    // STATIC
    public String adSoyad; // her new'lenen KonuStaticFinal için bu değişkenden bir tane yaratıp ona özel atar
    // [erişim tipi] static [tipi] [değişken adı]
    // Her nesne için bir tane YARATMAZ, sınıf için genel bir tane yaratır ve her nesne sadece bu bir taneye ulaşır
    // yani static değişkenler ve metodlar nesneye öze ldeğildir. Tüm nesneler için ortaktır
    // veeee uygulama ayağa kalkar kalkmaz memory'de yer alır  ve uygulama durana kadar memory'den silinmez
    public static String ulke;

    public static void sirketAdiniYazdir(){
        System.out.println("TESTINIUM");
        ulke = "ALM";
    }

    // FINAL
    // [erişim tipi] final [tipi] [değişken adı]
    // genelde metod içlerinde kullanılır
    public final String gezegen = "Dünya"; // genelde buradaki gibiden ziyade db'den okur atar değeri

    public void klajsdlasdjlasdla(){
        final String mimari;
        final String mimari2 = "monolith";
        mimari = "mikroservis";
        System.out.println("Uygulamanın mimarisi: " + mimari);
        System.out.println("askldsakdjaks : " + mimari);
        //mimari = "mikroadoajs";
        System.out.println("ogdofgdg : " + mimari);
        System.out.println("ogdofgdg asdasdasdsa: " + mimari);
        System.out.println("ogdofgdg asdasdasasdasdasdassd: " + mimari);
        System.out.println("ogdofgdg asdasdasasdasdasdassd: " + mimari2);
        System.out.println("ytjyjyjyu: " + mimari2);
        System.out.println("pdgfpdphdpfhfd: " + mimari2);
    }


    // CONSTANT
    // yani SABİTLER = FINAL ile STATIC'in birleşmiş halidir
    public static final String sirketAdi = "Testinium";
    public static final String SIRKET_ADI = "Testinium";

    private static final String WEB_OTOMASYON_FRAMEWORK = "Selenium";
    private static final String MOBIL_OTOMASYON_FRAMEWORK = "Appium";

    public void deneme(){
        System.out.println("Web için: " + WEB_OTOMASYON_FRAMEWORK);
        System.out.println("Mobil için: " + MOBIL_OTOMASYON_FRAMEWORK);
    }


}
