package com.yildirimholding.scm.kalitim;

public class Dog {

    private String adi;
    private String cinsi;
    private int yasi;
    private String renk;
    private float kokuAlmaMesafesi;

    public Dog() {
    } 

    public Dog(String adi, String cinsi, int yasi, String renk, float kokuAlmaMesafesi) {
        this.adi = adi;
        this.cinsi = cinsi;
        this.yasi = yasi;
        this.renk = renk;
        this.kokuAlmaMesafesi = kokuAlmaMesafesi;
        //System.out.println("Bu köpeğin adı: " +adi+ " cinsi: " +cinsi+ " yaşı: " + yasi);
        // bunu eklersem method çağrıldığında kullanılır.
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public float getKokuAlmaMesafesi() {
        return kokuAlmaMesafesi;
    }

    public void setKokuAlmaMesafesi(float kokuAlmaMesafesi) {
        this.kokuAlmaMesafesi = kokuAlmaMesafesi;
    }
}
