import tr.com.KonuErişimTipleri;
import tr.com.KonuStaticFinalConst;
import tr.com.Ogrenci;

public class AnaSinif {
    public static void main(String[] args) {
        System.out.println("Contructor");

        Ogrenci ogrenci = new Ogrenci();
        System.out.println("Öğrencinin adı: " + ogrenci.adSoyad + " ve yaşı: " + ogrenci.yas);

        KonuErişimTipleri konuErişimTipleri = new KonuErişimTipleri();
        konuErişimTipleri.adSoyad ="Serdar Ortaç";
        konuErişimTipleri.ekranaYazdir();

        KonuStaticFinalConst k1 = new KonuStaticFinalConst();
        k1.adSoyad = "Demet Akalın";

        KonuStaticFinalConst k2 = new KonuStaticFinalConst();
        k2.adSoyad = "Demet Akalın";

        KonuStaticFinalConst.ulke = "TR";
        System.out.println("ad: " + k1.adSoyad + " ülke: " + KonuStaticFinalConst.ulke);

        KonuStaticFinalConst.sirketadiyazdir();



    }
}
