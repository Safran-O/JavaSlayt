package com.yildirimholding.scm.soyutlama;

public class GameIslemlerPC extends GameIslemlerMicrosoft implements GameIslemler, MicrosoftIslemler {

    @Override
    public String oyunIndir() {
        return "CS-GO PC Edition";
    }

    @Override
    public void oyunOyna(String oyuuyuyun) {
        System.out.println(oyuuyuyun + "Oyun PC'de oynanıyor");
    }

    public void falanFilan(){
        System.out.println("falan filan inter mailan");
    }

    @Override
    public void lisansCheckEt() {
        System.out.println("lisans geçerlidir");
    }

}
