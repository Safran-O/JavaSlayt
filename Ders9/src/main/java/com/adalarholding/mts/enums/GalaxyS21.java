package com.adalarholding.mts.enums;

public class GalaxyS21 {

    private String model;
    private String uretimYili;
    private String isletimSistemi; // bunun yerine alttakini kullanmalı
    private MobileIsletimSistemleri operatingSystem;
    public Iphone12 iphoneOrnegi;

    public GalaxyS21() {
    }

    public GalaxyS21(String model, String uretimYili, String isletimSistemi) {
        this.model = model;
        this.uretimYili = uretimYili;
        this.isletimSistemi = isletimSistemi;
    }

    public GalaxyS21(String model, String uretimYili, String isletimSistemi, MobileIsletimSistemleri operatingSystem) {
        this.model = model;
        this.uretimYili = uretimYili;
        this.isletimSistemi = isletimSistemi;
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(String uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

    public MobileIsletimSistemleri getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(MobileIsletimSistemleri operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
