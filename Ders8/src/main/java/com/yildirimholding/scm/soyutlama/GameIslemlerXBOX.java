package com.yildirimholding.scm.soyutlama;

public class GameIslemlerXBOX extends GameIslemlerMicrosoft implements GameIslemler {

    @Override
    public String oyunIndir() {
        return "CS-GO XBOX Edition";
    }

    @Override
    public void oyunOyna(String oyunAdi) {
        System.out.println(oyunAdi + " oyunu XBOX'da oynanıyor");
    }

}
