/*
 * Senaryo: Alışveriş Sepeti
 * Bir e-ticaret platformunda, kullanıcıların alışveriş sepetlerindeki ürünlerin
 * toplam fiyatını hesaplamak veya detaylarını listelemek istiyoruz. Sepette
 * farklı türde ürünler olabilir: kitaplar ve elektronik cihazlar.
 * 
 * Yeni bir işlem eklemek istediğimizde (örneğin, toplam ağırlığı hesaplamak),
 * Visitor desenini kullanarak mevcut kodu değiştirmeden bu işlemi
 * gerçekleştirebiliriz.
 * 
 */
public class Main { // Client:alisveris sepeti
    public static void main(String[] args) {
        // sepete eklenen ürünler
        Item[] items = new Item[] {
                new Book("java programming", 50),
                new Book("Design patterns", 40),
                new Electronic("laptop", 2000),
                new Electronic("smartphone", 1500)
        };
        // ziyaretci(visitor): Fiyat hesaplayici
        CartVisitor priceCalculator = new PriceCalculator();

        // toplam fiyat hesaplama
        double totalCost = 0;
        System.out.println("ürün detaylari:");
        for (Item item : items) {
            totalCost += item.accept(priceCalculator);
        }
        System.out.println("\nToplam fiyat: " + totalCost);
    }
}