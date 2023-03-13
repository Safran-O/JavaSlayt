package com.adalarholding.mts;

import com.adalarholding.mts.enums.GalaxyS21;
import com.adalarholding.mts.enums.Iphone12;
import com.adalarholding.mts.enums.MobileIsletimSistemleri;

public class AnaSinif {

    public static void main(String[] args) {
        System.out.println("HELLÖĞ LÖ LO");

        System.out.println("---------------------");
        System.out.println("ENUMS");
        System.out.println("---------------------");

        GalaxyS21 galaxyS21Ali = new GalaxyS21();
        galaxyS21Ali.setModel("Beyaz");
        galaxyS21Ali.setUretimYili("2021");
        galaxyS21Ali.setIsletimSistemi("android");
        galaxyS21Ali.setOperatingSystem(MobileIsletimSistemleri.ANDROID);

        GalaxyS21 galaxyS21Veli = new GalaxyS21("Mor", "2020","Android", MobileIsletimSistemleri.ANDROID);

        GalaxyS21 galaxyS21Murtaza = new GalaxyS21("Mavi", "2020","ANDROID", MobileIsletimSistemleri.ANDROID);

        Iphone12 iphone12Mahmut = new Iphone12();

        if(galaxyS21Ali.getIsletimSistemi().equals("ANDROID")) {
            System.out.println("alinin telefonun işletim sistemi Android");
        } else {
            System.out.println("alinin telefonun işletim sistemi Android değil");
        }

        if(galaxyS21Ali.getOperatingSystem().equals(MobileIsletimSistemleri.ANDROID)) {
            System.out.println("alinin telefonun operating sistemi Android");
        } else {
            System.out.println("alinin telefonun operating sistemi Android değil");
        }

        switch (galaxyS21Veli.getOperatingSystem()) {
            case IOS:
                System.out.println("Velinin teline ios15 yükle");
                break;
            case ANDROID:
                System.out.println("Velinin teline android patch'i at");
                break;
            case HARMONY:
                System.out.println("Velinin teline huawei işleri yap");
                break;
            default:
                System.out.println("Velinin teline tuhaf bir işletim sistemi");
                break;
        }


        System.out.println("---------------------");
        System.out.println("EXCEPTION HANDLING");
        System.out.println("---------------------");

        // Yazımsal hata değil de mantıksal hata olduğu zaman program çöker patlar çatlar kıvranır göçer ama hangi göçer tabiki Ferhat Göçer
        //String adsadasd = newssss String(); // Complition Error
        //int i = 9 / 0; // Runtime Error

        try {
            int i = 9 / 0;
            System.out.println("i değeri = " + i);
            //System.out.println("yola devam");
        } catch (Exception e) {
            System.out.println("bir hata oldu: " + e);
            //System.out.println("yola devam");
        } finally {
            System.out.println("yola devam");
        }

        HataYakalamaOrnekler hataYakalamaOrnekler = new HataYakalamaOrnekler();
        hataYakalamaOrnekler.hataKonuAnlatimi();
        hataYakalamaOrnekler.hataKonuAnlatimi1();
        hataYakalamaOrnekler.hataKonuAnlatimi2();
        hataYakalamaOrnekler.hataKonuAnlatimi3();
        hataYakalamaOrnekler.hataKonuAnlatimi6();

    }

}
