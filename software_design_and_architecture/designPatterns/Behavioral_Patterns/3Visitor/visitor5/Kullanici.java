public interface Kullanici {
    boolean HesapOku(String hesapNo);

    void accept(IVisitor visitor);
}