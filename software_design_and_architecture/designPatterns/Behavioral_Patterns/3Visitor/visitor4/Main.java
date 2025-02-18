public class Main {
    public static void main(String[] args) {
        // Ürünler
        Product chocolate = new Chocolate();
        Product flower = new Flower();
        Product toy = new Toy();

        // ziyaretçi
        ProductVisitor customer = new Customer();

        // ürünlerin ziyaretçiyi kabul etmesi
        System.out.println("hediye magazasina hoş geldiniz!");
        chocolate.accept(customer);
        flower.accept(customer);
        toy.accept(customer);
    }
}
/*
 * Bir "Hediye Mağazası" düşünelim. Bu mağazada farklı türde ürünler (Çikolata,
 * Çiçek, Oyuncak) var.
 * Bir müşteri (Visitor), ürünleri inceler ve farklı türdeki ürünlere farklı
 * tepkiler verir:
 * 
 * Çikolatayı tattığında yorum yapar.
 * Çiçeklerin kokusunu kontrol eder.
 * Oyuncağın çalışıp çalışmadığını test eder.
 */
/*
 * Element (Eleman): Üzerinde işlem yapılacak nesnelerdir.
 * Visitor (Ziyaretçi): Element nesneler üzerinde farklı işlemleri uygulayan bir
 * nesnedir.
 */
/*
 * Nesnelere yeni davranışlar eklemek istiyoruz.
 * Var olan sınıf hiyerarşisini değiştirmek istemiyoruz.
 * Yeni işlemler eklenirken açık-kapalı prensibine uygun bir tasarım yapmak
 * istiyoruz.
 */