public class ThirdClass {
    public static void main(String[] args) {

        int hesaptakiPara = 1000;
        int borcum = 500;
        boolean zenginlik = hesaptakiPara > borcum;
        boolean calıskanlık = true;

        /*if (hesaptakiPara < borcum){
            System.out.println("Borcunuz var.");
        }
        if(hesaptakiPara>borcum){
            System.out.println("Artı değerdesiniz.");
        }
        if (hesaptakiPara ==borcum)
        {
            System.out.println("Hiç paranız kalmadı.");
        }

        if (hesaptakiPara<borcum){
            System.out.println("Eksi bakiyedesiniz");
        }else {
            System.out.println("Atrı değerdesiniz.");
        }

        if (zenginlik && calıskanlık){
            System.out.println("Zengin ve çalışkansınız.");
        }else {
            System.out.println("Değilsiniz.");
        }

        if (!zenginlik){
            System.out.println("Değilsiniz.");
        }

        int x = 5;
        int y = 7;
        System.out.println(x == 5 && y == 7);
        System.out.println(x == 5 || y == 7);
        System.out.println(!(x == 5  && y == 7));
        System.out.println(x+=1);

        String ad= "Onur";
        String soyad="Safran";

        System.out.println(ad + " " + soyad);
*/
        int x = 5;
        int y = 7;
        int z = 9;
        if (x == 5 ){
            System.out.println("x = 5tir.");
        }if (y == 7){
            System.out.println("y = 7 dir.");
        }if (z == 9) {
            System.out.println("z = 9 dur.");
        }

        if (x == 5 && y ==7 && z == 9 ){
            System.out.println("Değerler istenilenlere uygundur.");
        }
    }
}
