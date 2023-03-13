package com.yildirimholding.scm;

import com.yildirimholding.scm.kalitim.Aslan;
import com.yildirimholding.scm.kalitim.Cat;
import com.yildirimholding.scm.kalitim.Dog;
import com.yildirimholding.scm.kalitim.Hayvan;
import com.yildirimholding.scm.kalitim.Kedi;
import com.yildirimholding.scm.kalitim.Kopek;
import com.yildirimholding.scm.kalitim.Kus;
import com.yildirimholding.scm.soyutlama.GameIslemler;
import com.yildirimholding.scm.soyutlama.GameIslemlerPC;
import com.yildirimholding.scm.soyutlama.GameIslemlerPS4;
import com.yildirimholding.scm.soyutlama.GameIslemlerXBOX;
import com.yildirimholding.scm.soyutlama.OyunnnnIslemlerPS4;
import com.yildirimholding.scm.soyutlama.abstractsinif.OyunIslemler;
import com.yildirimholding.scm.soyutlama.abstractsinif.OyunIslemlerPC;

public class AnaSinif { 

    public static void main(String[] args) {

        System.out.println("MERHABA DÜNYA");

        /*
        OBJECT ORIENTED PROGRAMMING (OOP) - NESNE YÖNELİMLİ PROGRAMLAMA

Encapsulation - getter setter (private)
Inheritance - extends yani kalıtım (protected) - bir tane extends yapabilirsiniz
Polymorphizm - override yani metodu ezersin
Abstraction - soyutlama yani interface/implements veya abstract/extends ile tanımlamalar yazma

         */

        System.out.println("------------------------");
        System.out.println("1. ENCAPSULATION");
        System.out.println("------------------------");

        Ogrenci ogr1 = new Ogrenci();
        ogr1.adSoyad = "Yıldız Tilbe";
        //ogr1.yas = 3;  //Buna kızar çünkü private bir variable olarak tanımlanmış 
        ogr1.yasDiyeBirDegiskenVarDegeriniVer(55);

        System.out.println("Öğrenci: " + ogr1.adSoyad + " yaş: " + ogr1.yasDegeri());

        Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.setAdSoyad("Sinan Engin");
        ogretmen1.setYas(45);

        System.out.println("Öğretmen: " + ogretmen1.getAdSoyad() + " yaş: " + ogretmen1.getYas());

        System.out.println("------------------------");
        System.out.println("2. INHERITANCE");
        System.out.println("------------------------");

        Cat cat = new Cat();
        cat.setAdi("Tekir");
        cat.setCinsi("Sokak Kedisi");
        cat.setRenk("Beyaz");
        cat.setYasi(1);
        cat.setMaxDusmeYukseklik(2);
        cat.setTirmalamaKuvveti(13);
        System.out.println("Kedinin Adı: " + cat.getAdi() + " kedinin cinsi: " + cat.getCinsi() + " kedinin rengi: " + cat.getRenk() + " yası: " + cat.getYasi());

        Dog dog = new Dog("MorMenekşe", "Kangal", 3, "siyah", 4.5f);

        System.out.println("Kedi: " + cat.getAdi());
        System.out.println("Köpek: " + dog.getAdi());

        Dog dog1= new Dog();
        dog1.setAdi("Mamuş");
        dog1.setCinsi("kaniş");

        System.out.println("------ after kalıtım ---------");

        Kedi kedi = new Kedi();
        kedi.setAdi("Tekir");
        kedi.setCinsi("Sokak Kedisi");
        kedi.setRenk("Beyaz");
        kedi.setYasi(1);
        kedi.setMaxDusmeYukseklik(2);
        kedi.setTirmalamaKuvveti(13);

        Kopek kopek = new Kopek();
        kopek.setAdi("Fıstık");
        kopek.setCinsi("Kangal");
        kopek.setRenk("Mor");
        kopek.setYasi(1);
        kopek.setKokuAlmaMesafesi(5.4f);

        Kus kus = new Kus();
        kus.setAdi("Aydın");
        kus.setCinsi("Saksağan");
        kus.setRenk("Yeşil");
        kus.setYasi(2);
        kus.setHavalanmaMaesafesi(24);

        Aslan aslan = new Aslan();
        aslan.setAdi("Max");
        aslan.setCinsi("Afrika");
        aslan.setRenk("Sarı");
        aslan.setYasi(5);
        aslan.setMaxDusmeYukseklik(2);
        aslan.setTirmalamaKuvveti(13);
        aslan.setYelesiVarMi(true);

        System.out.println("Kedi: " + kedi.getAdi());
        System.out.println("Kopek: " + kopek.getAdi());
        System.out.println("Kuş: " + kus.getAdi());
        System.out.println("Aslan: " + aslan.getAdi());

        System.out.println("Protected işlendi----- ");

        kedi.sesCikar(); // Hayvan Sesi
        kopek.sesCikar(); // Hayvan Sesi
        kus.sesCikar(); // Hayvan Sesi
        aslan.sesCikar(); // Hayvan Sesi

        System.out.println("------------------------");
        System.out.println("3. POLYMORPHISM -----");
        System.out.println("------------------------");

        kedi.sesCikar(); // Miyav
        kopek.sesCikar(); // Hayvan Sesi
        kus.sesCikar(); // Hayvan Sesi
        aslan.sesCikar(); // Kükreme

        System.out.println("SUPER --------------------------------------");
        System.out.println("THIS derseniz: ata sinifi");
        System.out.println("SUPER derseniz: kendi sinifi");

        kedi.sesCikar(); // Miyav
        kopek.sesCikar(); // Hayvan Sesi   Hav Hav
        kus.sesCikar(); // Hayvan Sesi
        aslan.sesCikar(); // Kükreme

        System.out.println("Constructor Siralamasi --------------------");
        //Kus kus2 = new Kus(); // new Hayvan() + new Kus()

        System.out.println("instance of ------------------------------");
        Hayvan hayvan1 = new Hayvan();
        Kedi kedi1 = new Kedi();

        if(kedi1 instanceof Kedi) {
            System.out.println("kedi1 bir Kedi");
        }
        if(kedi1 instanceof Hayvan) {
            System.out.println("kedi1 bir Hayvan");
        }
        if(hayvan1 instanceof Kedi) {
            System.out.println("hayvan1 bir Kedidir");
        }

        //Hayvan hayvan2 = new Kus();
        //Kus kus3 = new Hayvan();


        System.out.println("------------------------");
        System.out.println("4. ABSTRACTION -----");
        System.out.println("------------------------");

        System.out.println("------------------------");
        System.out.println("4.1. INTERFACE -----");
        System.out.println("------------------------");

        System.out.println("intrerface olmayan --------------");
        OyunnnnIslemlerPS4 oyunnnnIslemlerPS4 = new OyunnnnIslemlerPS4();
        String oyun1 = oyunnnnIslemlerPS4.oyunIndir();
        oyunnnnIslemlerPS4.gameOyna(oyun1);

        System.out.println("intrerface olan --------------");
        GameIslemlerPC gameIslemlerPC = new GameIslemlerPC();
        String oyun2 = gameIslemlerPC.oyunIndir();
        gameIslemlerPC.oyunOyna(oyun2);
        gameIslemlerPC.falanFilan();
        gameIslemlerPC.lisansCheckEt();
        gameIslemlerPC.kontrolcuKontroluYap();

        GameIslemler gameIslemlerPs4 = new GameIslemlerPS4();
        String oyun3 = gameIslemlerPs4.oyunIndir();
        gameIslemlerPs4.oyunOyna(oyun3);

        GameIslemlerXBOX gameIslemlerXbox = new GameIslemlerXBOX();
        String oyun4 = gameIslemlerXbox.oyunIndir();
        gameIslemlerXbox.oyunOyna(oyun4);
        gameIslemlerXbox.kontrolcuKontroluYap();

        System.out.println("------------------------");
        System.out.println("4.2. ABSTRACT -----");
        System.out.println("------------------------");
        OyunIslemler oyunIslemlerPC1 = new OyunIslemlerPC();
        String oyun5 = oyunIslemlerPC1.oyunIndir();
        oyunIslemlerPC1.oyunOyna(oyun5);

        OyunIslemlerPC oyunIslemlerPC2 = new OyunIslemlerPC();
        oyunIslemlerPC2.ekstraMetod();

    }
    

}
