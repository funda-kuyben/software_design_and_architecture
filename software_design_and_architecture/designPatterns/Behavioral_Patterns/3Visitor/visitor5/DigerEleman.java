public class DigerEleman implements Kullanici {
    private String no;

    public DigerEleman(String no) {
        this.no = no;
    }

    @Override
    public boolean HesapOku(String hesapNo) {
        System.out.println("DigerEleman: hesap bilgileri okundu");
        return true;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public boolean KimlikOku() {
        System.out.println("DigerEleman: kimlik bilgileri okunamaz");
        return false;
    }
}
