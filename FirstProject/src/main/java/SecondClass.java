import java.sql.SQLOutput;

public class SecondClass {

    public static void main(String[] args) {
        int sayi1 = 3;
        int sayi2 = 5;

        int sonuc = toplama(sayi1,sayi2);
        //System.out.println(sonuc);

        int a = 5;
        int b= 3;
        //System.out.println(a%b);
        //System.out.println(a+b);
        //System.out.println("Toplam sonucu: " + a+b);
        System.out.println(++a);
        System.out.println(a);



    }

    public static int toplama(int sayi1, int sayi2){
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

}
