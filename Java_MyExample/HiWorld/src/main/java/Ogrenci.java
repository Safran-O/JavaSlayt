public class Ogrenci extends Insan {
    //OOP ile bağlantılı
    private int not;
    private Okul okul;

    public Okul getOkul() {
        return okul;
    }
//Okul classından okul diye nesne çıkardık.

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
