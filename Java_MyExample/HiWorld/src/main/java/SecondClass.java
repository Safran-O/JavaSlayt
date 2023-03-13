public class SecondClass {

    public static void main(String[] args) {
      int sayi1 = 5;
      int sayi2 = 6;

      int result = toplama(sayi1, sayi2);
        System.out.println("Değer: " + result);

        int a1 = 5;
        int b2 = 3;

        System.out.println(a1%b2);
        System.out.println(a1+b2);
        System.out.println(a1++);
        System.out.println(a1);
        System.out.println(++a1);
    }

    public static int toplama(int sayi1,int sayi2){
        //int sonuc = sayi1 +sayi2;
        //return sonuc;
        return sayi1 + sayi2;
    }
}
