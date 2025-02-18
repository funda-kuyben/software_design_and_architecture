public class Yetkili implements Kullanici {
    private String no;

    public Yetkili(String no) {
        this.no = no;
    }

    @Override
    public boolean HesapOku(String hesapNo) {
        System.out.println("Yetkili: Hesap bilgileri okundu.");
        return true;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this); // visitor u kabul eder
    }

    public boolean KimlikOku() {
        System.out.println("Yetkili: kimlik bilgilileri okundu");
        return true;
    }
}
