public class Main {
    public static void main(String[] args) {
        // hayvanlar
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        // Ziyaretçi
        AnimalVisitor visitor = new ZooVisitor();

        // hayvanlar ziyaretçiyi kabul ediyor
        System.out.println("Hayvanat bahcesi turuna hosgeldiniz.");
        tiger.accept(visitor);
        elephant.accept(visitor);
        bird.accept(visitor);

    }
}
/*
 * Bir hayvanat bahçesindesin ve farklı hayvanları gözlemlemek için bir
 * ziyaretçi olarak bir rehbere ihtiyaç duyuyorsun. Hayvanlar (Kaplan, Fil,
 * Kuş), ziyaretçiye (Visitor) kendi özelliklerini gösterir. Ancak hayvan
 * türlerine göre farklı bir rehberlik sağlanır:
 * 
 * Kaplanlar için tehlikeli bir mesafe önerilir.
 * Filler için büyük boyutlarına dikkat çekilir.
 * Kuşlar için uçuş yetenekleri vurgulanır.
 */
