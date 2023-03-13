package com.yildirimholding;

public class Ogretmen {
    private String adSoyad;
    private int yas;

    public String getAdSoyad() {
        return "Sayın " + adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
