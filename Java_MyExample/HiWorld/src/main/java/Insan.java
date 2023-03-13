public class Insan {
    //OOP ile bağlantılı
    private int yas;
    private String isim;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public  void kendiniTanit(){
        System.out.println("Benim adım: " + isim);
    }

    public static  void kendiniTanitYeni(){
        System.out.println("Benim adım: ");
    }
}
