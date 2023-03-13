package com.teknomarket.satrancoyun;

public class KonuErisimTipleri {

    // PUBLIC her yerden ulaşılır
    // PRIVATE sadece sınıf içinden ulaşılır
    // PROTECTED ileride anlatılacak (kalıtım eğitiminden sonra)
    public String adSoyad;
    private String dogumYeri; // private olanlar genelde: birden fazla metodunda aynı değişkeni ve değerini kullancaksan o zaman işini görür
    protected String sehir;
    String falan;

    public void ekranaYazdir(){
        System.out.println("public metod çıktısı");
        falanFilanInterMilan();
    }

    private void falanFilanInterMilan(){
        System.out.println("sadasddasda");
    }

}
