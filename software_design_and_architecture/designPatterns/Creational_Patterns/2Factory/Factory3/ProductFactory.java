public class ProductFactory {
    public IProduct createProduct(String productType, String productName, double productPrice) {
        if (productType.equals("X")) {
            return new ProductX(productName, productPrice);
        } else if (productType.equals("Y")) {
            return new ProductY(productName, productPrice);
        } else {
            throw new RuntimeException("Geçersiz Ürün Tipi : " + productType);
        }
    }
}
/*
 * createProduct metotunu istediğinize ve ihtiyacınıza göre static olarak
 * belirleyebilirsiniz. Yukarıdaki gibi bir logic ile de hangi sınıfı
 * istediğimizi belirtmiş oluyoruz. Eğer istenilenin dışında bir değer gelirse
 * de hata fırlatıyoruz.
 */