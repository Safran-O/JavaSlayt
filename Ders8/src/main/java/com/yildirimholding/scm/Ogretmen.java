package com.yildirimholding.scm;

public class Ogretmen {

    private String adSoyad;
    private int yas;

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad(){
        return "Sayın " + adSoyad;
    }

    public int getYas() {
        return yas; 
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
