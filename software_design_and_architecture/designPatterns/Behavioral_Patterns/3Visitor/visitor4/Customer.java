public class Customer implements ProductVisitor {
    @Override
    public void visitChocolate(Chocolate chocolate) {
        System.out.println("Müsteri:Çikolatayi tadiyorum...");
        chocolate.taste();
    }

    @Override
    public void visitFlower(Flower flower) {
        System.out.println("Müsteri: Çicek kokusunu kontrol ediyorum..");
        flower.smell();
    }

    @Override
    public void visitToy(Toy toy) {
        System.out.println("Müsteri: Oyuncağin calisip calismadigini kontrol ediyorum...");
        toy.play();
    }
}
