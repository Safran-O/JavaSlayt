package com.yildirimholding;

public class main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.adSoyad="Yıldız Tilbe";
        ogr1.yasDiyeBirDegiskenVarDegeriniVer(55);

        System.out.println("Öğrenci: " + ogr1.adSoyad);

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAdSoyad("Sinan Engin");
        ogretmen.setYas(45);

        System.out.println("Öğretmen: " + ogretmen.getAdSoyad() + "yaş: " + ogretmen.getYas());
         

    }
}
