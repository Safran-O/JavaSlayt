package com.yildirimholding.scm.soyutlama;

public class GameIslemlerPS4 implements GameIslemler {

    @Override
    public String oyunIndir() {
        return "CS-GO PS4 Edition";
    }

    @Override
    public void oyunOyna(String oyunAdi) {
        System.out.println(oyunAdi + " oyunu PS4'de oynanıyor");
    }

}
