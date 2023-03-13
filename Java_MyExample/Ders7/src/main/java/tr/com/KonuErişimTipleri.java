package tr.com;

public class KonuErişimTipleri {

    public String adSoyad;
    private String dogumyeri; //Sınıf içerisinden
    protected String sehir; //Kalıtıldığı alıt sıınıflardan ulaşılır.

    public void ekranaYazdir(){
        System.out.println("public method çıktısı.");
        ekranaYazdir2();
    }
    private void ekranaYazdir2(){
        System.out.println("private method çıktısı.");
    }

}
