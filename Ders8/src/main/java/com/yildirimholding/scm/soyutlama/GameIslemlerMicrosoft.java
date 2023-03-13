package com.yildirimholding.scm.soyutlama;

public class GameIslemlerMicrosoft {

    private boolean kontrolcuDestegiVarMi;

    public void kontrolcuKontroluYap(){
        kontrolcuDestegiVarMi = false;
    }

    public boolean isKontrolcuDestegiVarMi() {
        return kontrolcuDestegiVarMi;
    }

    public void setKontrolcuDestegiVarMi(boolean kontrolcuDestegiVarMi) {
        this.kontrolcuDestegiVarMi = kontrolcuDestegiVarMi;
    }
}
