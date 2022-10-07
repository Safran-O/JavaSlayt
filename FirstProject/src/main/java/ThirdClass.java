public class ThirdClass {
    public static void main(String[] args) {

        int hesaptakiPara = 1000;
        int borcum = 500;
        boolean zenginlik = hesaptakiPara > borcum;
        boolean caliskanlik = true;

        if(zenginlik && caliskanlik){
            //System.out.println("Zengin ve çalışkansınız");
        } else {
            //System.out.println("eksi bakiyede değilsiniz.");
        }
/*        if(hesaptakiPara > borcum){
            System.out.println("Halen paranız var.");
        }
        if(hesaptakiPara == borcum){
            System.out.println("hiç paranız kalmadı");
        }*/



        //System.out.println(!(x==5 && y==7));
        // x+=1   x=x+1

        //System.out.println(x+=1);
        String ad = "Mehmet";
        String soyisim = "Aksahin";

        System.out.println(ad + soyisim);
        System.out.println(ad +" "+soyisim);

        int x = 5;
        int y = 7;
        int z = 9;

        if(x==5){
            System.out.println("x =5 tir");
            if(y==7){
                System.out.println("y=7 dir");
                if(z==9){
                    System.out.println("z= 9 dur");
                }
            }
        }



    }
}
