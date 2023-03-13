package tr.com;

public class Ogrenci {
    public String adSoyad;
    public int yas;
    public void ekranaAdiniYazdir(){
        System.out.println("Öğrencinin adı: " + adSoyad + " ve yaşı: " + yas);
    }

    public Ogrenci(){
        System.out.println("Contructordan gelen değer yazmasakda aslında vardır.");
        yas = 20;
    }
}
