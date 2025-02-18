public class Toy implements Product {
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitToy(this);
    }

    void play() {
        System.out.println("Oyuncak çalisiyor");
    }
}
