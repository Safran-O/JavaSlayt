public class SnifCalismasiYeniBilgiler extends SinifCalismasiYeni {
    private int grade;
    private boolean devamsizlik;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isDevamsizlik() {
        return devamsizlik;
    }

    public void setDevamsizlik(boolean devamsizlik) {
        this.devamsizlik = devamsizlik;
    }

    public void notVeDevamsizlik() {
        if (this.grade <= 60) {
            System.out.println("F " + grade);
        } else {
            System.out.println("Passed.");
        }
        System.out.println("Öğrencinin notu: " + grade + " ve devamsızlık durumu: " + devamsizlik);
    }
}
