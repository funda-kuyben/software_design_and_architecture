public class KimlikOkuyucu implements IVisitor {
    @Override
    public void visit(Yetkili yetkili) {
        System.out.println("KimlikOkuyucu: Yetkili kimlik bilgilerini okuyor");
        yetkili.KimlikOku();
    }

    @Override
    public void visit(DigerEleman digerEleman) {
        System.out.println("KimlikOkuyucu: DigerEleman kimlik bilgilerini okuyamaz");
        digerEleman.KimlikOku();
    }
}
