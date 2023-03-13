package com.yildirimholding.scm;

public class Ogrenci {

    public String adSoyad;
    private int yas; // default değeri 0

    public void yasDiyeBirDegiskenVarDegeriniVer(int deger) {
        yas = deger - 3;
    }

    public int yasDegeri(){
        return yas; 
    }

    /*
    Contructor Method yazılmasa bile vardır Unutma !!!
    public Ogrenci(){
    System.out.println("Deneme");
    }
    */
}
