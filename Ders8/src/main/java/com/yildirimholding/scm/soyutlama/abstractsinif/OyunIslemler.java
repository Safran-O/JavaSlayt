package com.yildirimholding.scm.soyutlama.abstractsinif;

/**
 * Abstract sınıf hem interface gibi kural yazmanızı sağlar hem de
 * normal sınıf gibi kod yazar evlatlarına bırakırsınız
 */
public abstract class OyunIslemler {

    // Kural
    // [abstract] [erişim tipi] [dönüş tipi] [metod adı] ([varsa parametre tipi]); // erişim tipi vermeyebilirsiniz
    abstract public String oyunIndir();
    abstract public void oyunOyna(String oyunAdi);

    // Buraya kadar bildiğiniz interface gibiydi
    // Buradan sonra da her class'da olan şeyler olabiliyor

    private String firmaAdi;

    public void falan() {
        System.out.println("faaaalaaaan");
    }

    public String filan(int x) {
        return "fiiiiiiilaaaaaaan";
    }

    // getter setter
    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

}
