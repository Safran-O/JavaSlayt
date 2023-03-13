public class SinifCalismasiYeni {
    public static void main(String[] args) {
        SnifCalismasiYeniBilgiler student = new SnifCalismasiYeniBilgiler();
        student.setGrade(75);
        student.setDevamsizlik(false);
        student.notVeDevamsizlik();
    }
}
