public class ZooVisitor implements AnimalVisitor {
    @Override
    public void visitTiger(Tiger tiger) {
        System.out.println("Ziayretçi: kaplan tehlikeli, mesafeni koru!");
        tiger.roar();
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Ziyarteçi: Fil büyük ve güçlü, dikkatli ol!");
        elephant.trumpet();
    }

    @Override
    public void visitBird(Bird bird) {
        System.out.println("Ziyaretçi: Kuş uçabilir, yukari bak");
        bird.fly();
    }
}
// Ziyaretçi sınıfı (Somut sınıf)
