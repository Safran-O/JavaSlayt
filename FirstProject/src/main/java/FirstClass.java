public class FirstClass {

    public static void main(String[] args) {

        //System.out.println("Merhaba");

        //Sınıf isimleri büyük başlar
        //metod ve değişken isimleri küçük başlar.
        //CamelCase

        /*
        Örnek sınıf ismi:

        OrnekSinif

        Örnek metod:

        denemeMetodu

        Örnek değişken:

        ornekDegisken

         */

        /*
        Multiline yorum
         */

        /**
         * @author:ebubekirDurukal
         */


        // final int PI_SAYISI = 3;
        //Primitive Types
        byte degisken1;
        int degisken2 = 2;
        long degisken3 = 5L;
        float degisken4 = 32.5F;
        double degisken5 = 3.24;
        char degisken6 = 'c';
        boolean degisken = true;
        String degisken7 = "Merhaba";


        //System.out.println(degisken3);


        //Wrapper Types
        Integer degisken8 = 3;
        //System.out.println("Wrapper type degeri: " + degisken8.floatValue());
        //Long degisken9 = new Long(34l);


        int a = 5;
        long b= a;

        System.out.println(b);

        a= (int) b;

    }
}
