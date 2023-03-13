package com.yildirimholding.scm.kalitim;

public class Kus extends Hayvan {

    private int havalanmaMaesafesi;

    public Kus() {
        System.out.println("Kuş nesnesi yaratıldı");
    }

    public int getHavalanmaMaesafesi() {
        return havalanmaMaesafesi; 
    }

    public void setHavalanmaMaesafesi(int havalanmaMaesafesi) {
        this.havalanmaMaesafesi = havalanmaMaesafesi;
    }
}
