public class FifthClass {
    public static void main(String[] args) {
        //OOP başlıyor...
        Ogrenci ogrenci1 = new Ogrenci();
        /*ogrenci1.isim ="Onur";
        ogrenci1.not = 95;
        ogrenci1.yas = 26;

        ogrenci1.kendiniTanit();

        Get ve Setter olmadan değerler private olmadan bu şekilde kullanılabilir.
*/
        ogrenci1.setIsim("Onur");
        ogrenci1.kendiniTanit();
        ogrenci1.setNot(95);

        Insan.kendiniTanitYeni();

    }
}
