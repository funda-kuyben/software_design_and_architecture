public class Main {
    public static void main(String[] args) {
        Kullanici y1 = new Yetkili("1234");
        Kullanici de1 = new DigerEleman("1234");

        IVisitor kimlikOkuyucu = new KimlikOkuyucu();
        System.out.println("Yetkili hesap oku:");
        y1.HesapOku("1234");

        System.out.println("\nDigerEleman hesap oku");
        de1.HesapOku("1234");

        System.out.println("\nYetkili kimlik oku:");
        y1.accept(kimlikOkuyucu);

        System.out.println("\nDigerEleman kimlik oku:");
        de1.accept(kimlikOkuyucu);
    }
}
