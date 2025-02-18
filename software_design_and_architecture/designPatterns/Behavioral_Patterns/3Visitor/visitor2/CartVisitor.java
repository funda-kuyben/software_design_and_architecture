public interface CartVisitor { // Visitor arayüzü
    double visit(Book book);

    double visit(Electronic elektronic);
}
// Kitap ve elektronik ürünler için ziyaretçi(visitor) operasyonlarını tanımlar.