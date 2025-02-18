public class Program {

    public static void main(String[] args) {
        // ürün oluşturuluyor
        ProductItem phone = new ProductItem("smartphone", 1000.0);

        // üyeler oluşturuluyor
        Member funda = new Customer("Funda");
        Member sila = new Customer("Sila");

        // üyeler ürünü takip etmeye başlıyor
        phone.addObservers(funda);
        phone.addObservers(sila);

        // ürün fiyatı değişiyor
        System.out.println("\nPrice is changing...");
        phone.setPrice(900.0);

        // Sila ürünü takip etmeyi bırakıyor
        phone.removeObservers(sila);

        // ürün fiyatı tekrar değişiyor
        System.out.println("\nPrice is changing again...");
        phone.setPrice(850.0);
    }

}
/*
 * Subject (ProductItem): Ürünü ve fiyatını tutar.
 * Fiyat değişince tüm üyeleri bilgilendirir.
 * Observer (Customer): Ürün fiyatı değişince kendisine bildirim gelir.
 * Ana İşleyiş:
 * Üyeler ürüne abone olur.
 * Ürün fiyatı değiştiğinde, notifyObservers tetiklenir ve her üyenin update
 * metodu çağrılır.
 * Üye, abone olmaktan çıkabilir.
 */
