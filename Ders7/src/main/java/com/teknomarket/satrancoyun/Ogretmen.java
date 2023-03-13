package com.teknomarket.satrancoyun;

public class Ogretmen {

    public String adSoyad;
    public String brans;

    public Ogretmen() {
        System.out.println("memory yer aldı öğretmen için");
        brans = "ilkokul";
    }

    /*
    public Ogretmen(String ogretmeninAdSoyadi, String ogrtmnBrans) {
        adSoyad = ogretmeninAdSoyadi;
        brans = ogrtmnBrans;
    }
     */

    public Ogretmen(String adSoyad, String brans) {
        this.adSoyad = adSoyad;
        this.brans = brans;
    }

    public void ogrenciNotlariniHesapla(){
        int not = 90;
        String brans = "Sosyal";
        if (brans.equals("Fen")) {
            not += 20;
        }
        System.out.println("Öğretmenin Branşı: " + this.brans);
        System.out.println("Öğrencinin otu için bakılan Branş: " + brans);
    }



}
