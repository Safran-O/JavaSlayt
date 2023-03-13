package com.adalarholding.mts;

import com.adalarholding.mts.enums.GalaxyS21;

public class HataYakalamaOrnekler {

    public void hataKonuAnlatimi() {
        try {
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
            System.out.println("Metoda ait tüm kodlar burada olacak");
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
            // Metoda ait tüm kodlar burada olacak
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        }
    }

    public void hataKonuAnlatimi1() {
        try {

            int[] rakamArray = {35, 66, 89};
            System.out.println("dizinin 20.elemanı: " + rakamArray[19]);
            System.out.println("danke schön");

        } catch (Exception e) {
            System.out.println("Hata hataKonuAnlatimi1: " + e);
        }
    }

    public void hataKonuAnlatimi2() {
        try {

            GalaxyS21 galaxyS21 = new GalaxyS21();
            System.out.println("Model: " + galaxyS21.iphoneOrnegi.getModel());

        } catch (Exception e) {
            System.out.println("Hata hataKonuAnlatimi2: " + e);
        }
    }

    public void hataKonuAnlatimi3() {
        try {

            //int x = 9 / 0;

            //int[] rakamArray = {35, 66, 89};
            //System.out.println("dizinin 20.elemanı: " + rakamArray[19]);

            //GalaxyS21 galaxyS21 = new GalaxyS21();
            //System.out.println("Model: " + galaxyS21.iphoneOrnegi.getModel());

            Integer.parseInt("9");
            Integer.parseInt("aaa");
            Integer.parseInt("8");

        } catch (ArithmeticException e) {
            System.out.println("Bölme hatası : " + e);
        } catch (NullPointerException e) {
            System.out.println("New yapmamadan dolayı boş bırakma hatası : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi boyutu dışına çıkma hatası : " + e);
        } catch (Exception e) {
            System.out.println("Yahu işte yapmışsın bir hata: " + e);
        }
    }

    public void hataKonuAnlatimi6() {
        try {
            hataKonuAnlatimi6altMetod();
            System.out.println("okito nakamura");
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    // throws ile metodun hataları yönlendirdiğini söyleyip, bu metodu kullanan kişileri try-catch kullanmaya zorlamış oluyoruz
    public void hataKonuAnlatimi6altMetod() throws Exception{
        try {
            int x = 9 / 0;
        } catch (Exception e) {
            // throw ile hatayı bu metodu kullanana gönderiyoruz
            //throw e;
            throw new BenimKeyfiminExceptioni();
        }
    }


}
