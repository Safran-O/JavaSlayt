package tr.com.safranholding.pys;

import java.util.*;

public class AnaSinif {
    public static void main(String[] args) {
        //System.out.println("Naberla");

        int[] xArray = new int[10]; //10 sayı tutar.
        xArray[0] = 5000; //1. Eleman
        xArray[1] = 3500; //2. Eleman
        xArray[9] = 2500;
        //xArray[10]= 4000;
        int[] yDizisi = {5000, 3500, 2500, 2345}; //new int[] 4 lu bir dizi oldu.

        System.out.println("yDizisi: " + yDizisi[0]);

        //String[] halay = new String[5];
        String[] halay = {"Mahmut Tuuncer", "Ahmet Parlar", "Sibel Oğuz", "Nazlı Hilalbucak","Kaan Kömürcü","Önder Yerim"};

        for (int i = 0; i < halay.length; i++){
            System.out.println("Halay: " + halay[i]);
        }

        for (String halaydekiEleman :halay){
            System.out.println("Halay foreach: " + halaydekiEleman);
        }

        /*
        String[][] ikiBoyutlu = new String[2][4];
        ikiBoyutlu[0][0]="A";
        System.out.println(ikiBoyutlu[0][0]);

        for (int i = 0; i < 2; i++){
            for (int j=0; j<4; j++){
                System.out.println(ikiBoyutlu[i][j]);
            }
        }*/

        //System.out.println("Argüman: " + args[0]);

        int[] zArray = {54,23,45,123,12};
        Arrays.sort(zArray);

        for (int z:zArray){
            System.out.println("Array değeri: " + z);
        }
        //------Sisteme verdikçe şişecek yapıyı kullancaz.
        /*String[] ogrenciler = new String[100];
        ogrenciler[0] = "Ali";
        */


        System.out.println("---------------------------------------------");
        List<String> sehirlerList =new ArrayList<>();
        //List<String> sehirlerList =new LinkedList<>(); //Sıralı olarak çağırırdı
        sehirlerList.add("İstanbul");
        sehirlerList.add("Ankara");
        sehirlerList.add("İzmir");
        sehirlerList.add("İskenderun");
        sehirlerList.add("Antalya");
        sehirlerList.add("Ordu");
        sehirlerList.add("Sivas");

        System.out.println("İlk şehir: " +sehirlerList.get(0));

        for (int i = 0;i< sehirlerList.size(); i++){
            System.out.println(sehirlerList.get(i));
        }
        for (String sehir : sehirlerList){
            System.out.println(sehir);
        }

        if (sehirlerList.contains("Mardin")){
            System.out.println("Mardin listede var.");
        }else{
            System.out.println("Maalesef listede yok.");
        }

        System.out.println("----------------------------");

        Set<String> sehirlerSet = new HashSet<>();
        sehirlerSet.add("Samsun");
        sehirlerSet.add("Lüleburgaz");
        sehirlerSet.add("Lüleburgaz"); //2.yi pass geçer.
        sehirlerSet.add("Çorum");

        for (String shr: sehirlerSet){
            System.out.println(shr);
        }

        System.out.println("-------------------------");
        /*
        Map<Integer, String> sehirlerMap = new HashMap<>();
        sehirlerMap.put(34,"İstanbul");
        sehirlerMap.put(31,"Hatay");
        sehirlerMap.put(35,"İzmir");
        sehirlerMap.put(38,"Kayseri");
        sehirlerMap.put(24,"ErzinJohn");
        sehirlerMap.put(24,"Erzincan");

        for (Map.Entry sehirlerKeyValue: sehirlerMap.entrySet()){
            System.out.println(sehirlerKeyValue.getKey()+"Değerler: " +sehirlerMap.getValue());
        }
        */



    }
}
