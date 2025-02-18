public class PriceCalculator implements CartVisitor { // Concrete Visitor: Toplam Fiyat Hesaplama
    @Override
    public double visit(Book book) {
        double cost = book.getPrice();
        System.out.println("Kitap: " + book.getName() + "-Fiyat: " + cost);
        return cost;
    }

    public double visit(Electronic electronic) {
        double cost = electronic.getPrice() * 1.18; // %18 KDV ekleniyor
        System.out.println("Elektronik: " + electronic.getName() + "-Fiyat(KDV dahil):" + cost);
        return cost;
    }
}
