package com.yildirimholding.scm.kalitim;

public class Kopek extends Hayvan {

    private float kokuAlmaMesafesi;

    @Override
    public void sesCikar() {
        super.sesCikar();
        System.out.println("Hav Hav");
        //Sadece Hav Hav + Hayvan Sesi çıkarır. 
    }

    public float getKokuAlmaMesafesi() {
        return kokuAlmaMesafesi; 
    }

    public void setKokuAlmaMesafesi(float kokuAlmaMesafesi) {
        this.kokuAlmaMesafesi = kokuAlmaMesafesi;
    }
}
