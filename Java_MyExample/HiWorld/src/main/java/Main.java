public class Main {
    public static void main (String args[]){
        /**
         * @author:OnurSafran
         */
        //System.out.println("HiWorld");
        //Sınıf isimleri büyük başlar
        //method ve değişken isimleri küçük başlar
        /*
        CamelCase OrnekSinif
        Method denemeMethod
        variable ornekDegisken
         */
        //final int PI_SAYISI = 3; //Tamamen finallar için bu yapi kullanilamaz
        //Primitive Types
        byte degisken1;
        int degisken2 =4;
        long degisken3 = 5L;
        float degisken4 = 32.5F;
        double degisken5 = 12.5;
        char   degisken6 = 'c';
        boolean degisken = true;
        String degisken7 = "Onur";
       //System.out.println(degisken3);

        //Wrapper Types Primitiveler null alamaz ama Wrapper types almaz
        Integer degisken8 = 4;
        //System.out.println("Wrapper Type değeri: " + degisken8.floatValue());
        int a = 5;
        long b = a;
        System.out.println(b);
        //a=(int) b

        int a1 = 5;
        int b2 = 3;
        int result = toplama(a1,b2);
        System.out.println("Sonuc:" + result);

    }
    public static int toplama(int sayi1,int sayi2){
        //int sonuc = sayi1 +sayi2;
        //return sonuc;
        return sayi1 + sayi2;
    }
}
