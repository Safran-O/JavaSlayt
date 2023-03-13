package com.yildirimholding.scm.kalitim;

public class Aslan extends Kedi {

    private boolean yelesiVarMi = true;

    @Override
    public void sesCikar() {
        System.out.println("Kükreme"); 
    }
    //Sadece kükreme çıkar havyandan extend edilmedi.

    public void adsadsads() {
        adi = "asdasddasdas";
    }

    public boolean isYelesiVarMi() {
        return yelesiVarMi;
    }

    public void setYelesiVarMi(boolean yelesiVarMi) {
        this.yelesiVarMi = yelesiVarMi;
    }
}
