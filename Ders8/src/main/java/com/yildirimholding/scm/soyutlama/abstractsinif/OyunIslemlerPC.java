package com.yildirimholding.scm.soyutlama.abstractsinif;

public class OyunIslemlerPC extends OyunIslemler{

    @Override
    public String oyunIndir() {
        return "CS-GO (PC Edition)";
    }

    @Override
    public void oyunOyna(String oyunAdi) {
        System.out.println(oyunAdi + " oyunu PC'de oynanıyor");
    }

    public void ekstraMetod(){
        System.out.println("asklndlsfhdsjkhfkdskfh");
    }
}
