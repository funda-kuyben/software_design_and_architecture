/*
 * Bir restoran düşünelim:
 * 
 * Restoranda yemek siparişi verirken mutfak, servis, ödeme, temizlik gibi
 * birden fazla süreç işler.
 * Ancak müşteri (istemci) bu detaylarla uğraşmaz. Sadece garsona (Facade)
 * sipariş verir ve gerisini garson halleder.
 */
/*
 * İstemci (müşteri) sadece Restoran (Facade) sınıfıyla etkileşim kurar. Alt
 * sistemlerin detayları gizlenmiştir.
 */
public class Main {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();

        // bir yemek siparisi veriliyor
        restoran.yemekSiparisVer("kebap", 90, 5);
        // baska siparis
        restoran.yemekSiparisVer("lahmacun", 60, 6);
    }
}