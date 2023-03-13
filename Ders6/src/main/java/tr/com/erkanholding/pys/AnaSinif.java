package tr.com.erkanholding.pys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnaSinif {

    public static void main(String[] args) {
        System.out.println("HELLOOOOO");

        System.out.println("-----------------");
        System.out.println("ARRAYS & COLLECTIONS");
        System.out.println("-----------------");
        System.out.println("-----------------");

        System.out.println("-----------------");
        System.out.println("ARRAYS");
        System.out.println("-----------------");

        int x1 = 10;
        int x2 = 7;
        int x3 = 45;
        int x99 = 45;

        int[] xArray = new int[10]; // 10 tane sayı tutar
        xArray[0] = 5000; // 1. eleman
        xArray[1] = 3500; // 2. eleman
        xArray[9] = 2500;
        //xArray[10] = 4000;
        //xArray[30] = 4000;

        int[] yDizisi = {500, 3590, 5436, 6575576, 2324, 43}; // new int[6]
        System.out.println("yDizisi ilk eleman = " + yDizisi[0]);

        String[] halayDizisi = {"Mahmut Tuncer", "Ahmet Parlar", "Sibel Oğuz", "Nazlı Hilal Bucak", "Kaan Kömürcü", "Önder Yerim", "Ramazan Tüylüoğlu", "Demir Kızılkaya"};
        //System.out.println(halayDizisi[0]);
        //for (int i = 0; i < 7; i++) {
        for (int i = 0; i < halayDizisi.length; i++) {
            System.out.println("Halay: " + halayDizisi[i]);
        }

        for (String halaydakiEleman : halayDizisi) {
            // halayDizisi[i] yerine halaydakiEleman
            System.out.println("Halay (foreach): " + halaydakiEleman);
        }

        /*
        "A" "B" "C" "D"
        "E" "F" "G" "H"
        */
        String[][] ikiBoyutlu = new String[2][4];
        ikiBoyutlu[0][0] = "A";
        ikiBoyutlu[0][1] = "B";
        ikiBoyutlu[0][2] = "C";
        ikiBoyutlu[0][3] = "D";
        ikiBoyutlu[1][0] = "E";
        ikiBoyutlu[1][1] = "F";
        ikiBoyutlu[1][2] = "G";
        ikiBoyutlu[1][3] = "H";
        System.out.println("İki Boyutlu Döngünün Elemanı: " + ikiBoyutlu[1][2]);

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<4; j++) {
                System.out.println("İki boyutlu dizi : " + ikiBoyutlu[i][j]);
            }
        }

        if(args.length > 0) {
            System.out.println("Argüman: " + args[0]);
        } else {
            System.out.println("Argüman verilmemiş");
        }

        // DİZİLERDE SIRALAMA
        int[] zArray = {65, 95, 26, 32, 45, 678, 98};
        for (int z : zArray) {
            System.out.println("Z değeri: " + z);
        }

        System.out.println("Sıralama yapıyoruz");
        Arrays.sort(zArray); // stringleri alfabetik, sayıları değerlerine göre küçükten büyüğe sıralar

        for (int z : zArray) {
            System.out.println("Z değeri: " + z);
        }

        Ogrenci[] ogrArray = new Ogrenci[5];
        Ogrenci ogr1 = new Ogrenci();
        ogr1.ad = "adsaads";
        ogr1.yas = 34;
        ogrArray[0] = ogr1;

        // --------------
        System.out.println("-----------------");
        System.out.println("COLLECTION - LIST - ARRAYLIST");
        System.out.println("-----------------");
        /*
        String[] ogrenciler = new String[100000000];
        ogrenciler[0] = "Ali";
         */

        String[] sehirlerArray = new String[5];
        sehirlerArray[0] = "Istanbul";

        // poşet gibi olan herhangi bir sınıırı olmayan bir dizi olsa ne güzel olurdu
        List<String> sehirlerList = new ArrayList<>(); // sıralamanın bir önemi yok
        //List<String> sehirlerList = new LinkedList<>(); // sıralı tutardı
        sehirlerList.add("İstanbul");
        sehirlerList.add("Ankara");
        sehirlerList.add("Malatya");
        sehirlerList.add("İzmir");
        sehirlerList.add("İskenderun");
        sehirlerList.add("Antalya");
        sehirlerList.add("Antalya");
        sehirlerList.add("Sivas");
        sehirlerList.add("Sivas");
        sehirlerList.add("Mardin");

        System.out.println("İlk Şehir: " + sehirlerList.get(0));
        for (int i = 0; i < sehirlerList.size(); i++) {
            System.out.println("Şehir: " + sehirlerList.get(i));
        }

        for(String sehir : sehirlerList) {
            System.out.println("Şehir (güzel for): " + sehir);
        }

        if(sehirlerList.contains("Mardin")) {
            System.out.println("Mardin listede var");
        } else {
            System.out.println("Mardin listede yok");
        }

        sehirlerList.remove("Ankara");
        if(sehirlerList.contains("Ankara")) {
            System.out.println("Ankara listede var");
        } else {
            System.out.println("Ankara listede yok");
        }


        Ogrenci ogr2 = new Ogrenci();
        ogr2.ad = "tyjtyt";
        ogr2.yas = 12;

        Ogrenci ogr3 = new Ogrenci();
        ogr3.ad = "uılıulıu";
        ogr3.yas = 78;

        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(ogr1);
        ogrenciList.add(ogr1);
        ogrenciList.add(ogr2);
        ogrenciList.add(ogr2);
        ogrenciList.add(ogr2);
        ogrenciList.add(ogr3);
        ogrenciList.add(ogr3);

        ogrenciList.remove(ogr3);

        for (Ogrenci ogrenci : ogrenciList) {
            System.out.println("Öğrenciler: " + ogrenci.ad);
        }

        System.out.println("-----------------");
        System.out.println("COLLECTION - SET - HASHSET");
        System.out.println("-----------------");
        Set<String> sehirlerSet = new HashSet<>();
        sehirlerSet.add("Samsun");
        sehirlerSet.add("Samsun"); // 2.yi hesaba katmaz
        sehirlerSet.add("Lüleburgaz");
        sehirlerSet.add("Lüleburgaz"); // 2.yi hesaba katmaz
        sehirlerSet.add("Lüleburgaz"); // 3.yü hesaba katmaz
        sehirlerSet.add("Çorum");

        for (String shr : sehirlerSet) {
            System.out.println("Şehir (set): " + shr);
        }

        // contains,
        // size,
        // remove,
        // vs.
        // bunda da var

        Set<Ogrenci> ogrenciSet = new HashSet<>();
        ogrenciSet.add(ogr1);
        ogrenciSet.add(ogr1);
        ogrenciSet.add(ogr1);
        ogrenciSet.add(ogr2);
        ogrenciSet.add(ogr3);
        ogrenciSet.add(ogr3);
        ogrenciSet.add(ogr3);

        for (Ogrenci ogrenci : ogrenciSet) {
            System.out.println("Öğrenci (set): " + ogrenci.ad);
        }

        System.out.println("-----------------");
        System.out.println("COLLECTION - MAP - HASHMAP");
        System.out.println("-----------------");

        Map<Integer, String> sehirlerMap = new HashMap<>();
        sehirlerMap.put(34, "İstanbul");
        sehirlerMap.put(31, "Hatay");
        sehirlerMap.put(35, "İzmir");
        sehirlerMap.put(38, "Kayseri");
        sehirlerMap.put(32, "Isparta");
        sehirlerMap.put(33, "Mersin");
        sehirlerMap.put(20, "Denizli");
        sehirlerMap.put(24, "ErzinJohn");
        // ......
        sehirlerMap.put(24, "Erzincan");

        for (Map.Entry sehirlerKeyValue : sehirlerMap.entrySet()) {
            System.out.println("Key: " + sehirlerKeyValue.getKey() + " - Değer: " + sehirlerKeyValue.getValue());
        }

        if(sehirlerMap.containsKey(34)) {
            System.out.println("İstanbul var");
        }

        if(sehirlerMap.containsValue("Erzincan")) {
            System.out.println("Erzincan var");
        }

        sehirlerMap.remove(34);
        if(sehirlerMap.containsKey(34)) {
            System.out.println("İstanbul var");
        }else {
            System.out.println("İstanbul yok");
        }

        Map<String, String> dersMap = new HashMap<>();
        dersMap.put("MAT-101", "Matematik 101");
        dersMap.put("CAL-101", "Calculus 101");
        dersMap.put("BIL-101", "Bilgisayar Dersi 101");
        dersMap.put("BIL-101", "Yazılıma Giriş");

        System.out.println("-----------------");
        System.out.println("COLLECTION EXTRAS - ITERATOR");
        System.out.println("-----------------");
        // List, Set ve Map için yani tüm Collenction'lar için kullanılabilir

        Iterator<String> sehirlerListIteratoru = sehirlerList.iterator();
        while (sehirlerListIteratoru.hasNext()) {
            String sehir = sehirlerListIteratoru.next();
            System.out.println("Şehir (list iterator): " + sehir);
        }

        Iterator<String> sehirlerSetItr = sehirlerSet.iterator();
        while (sehirlerSetItr.hasNext()) {
            String sehir = sehirlerSetItr.next();
            System.out.println("Şehir (set iterator): " + sehir);
        }

        Iterator sehirlerMapItr = sehirlerMap.entrySet().iterator();
        while (sehirlerMapItr.hasNext()) {
            Map.Entry sehirKeyValue = (Map.Entry) sehirlerMapItr.next();
            System.out.println("Şehir (map iterator): " + sehirKeyValue.getValue());
        }



    }

}
