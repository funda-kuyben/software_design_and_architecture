public class Flower implements Product {
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitFlower(this);
    }

    void smell() {
        System.out.println("çiçeğin kokusu harika!");
    }
}
