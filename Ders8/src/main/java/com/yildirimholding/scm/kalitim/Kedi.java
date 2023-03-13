package com.yildirimholding.scm.kalitim;

public class Kedi extends Hayvan {

    private int tirmalamaKuvveti;
    private int maxDusmeYukseklik;

    @Override 
    public void sesCikar() {
        System.out.println("Miyav");
        //Miyav Çıkarır.
    }

    public void protectedKonusuIcinBunaBak() {
        adi = "sadmasşldasşd";
    }

    public int getTirmalamaKuvveti() {
        return tirmalamaKuvveti;
    }

    public void setTirmalamaKuvveti(int tirmalamaKuvveti) {
        this.tirmalamaKuvveti = tirmalamaKuvveti;
    }

    public int getMaxDusmeYukseklik() {
        return maxDusmeYukseklik;
    }

    public void setMaxDusmeYukseklik(int maxDusmeYukseklik) {
        this.maxDusmeYukseklik = maxDusmeYukseklik;
    }
}
