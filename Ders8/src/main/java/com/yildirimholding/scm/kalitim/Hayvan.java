package com.yildirimholding.scm.kalitim;

public class Hayvan {

    protected String adi;
    protected String cinsi;
    protected int yasi; 
    protected String renk;

    public void sesCikar(){System.out.println("Hayvan sesi");}

    public Hayvan() {System.out.println("Hayvan nesnesi yaratıldı");}

    public String getAdi() {return adi;}

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
}
