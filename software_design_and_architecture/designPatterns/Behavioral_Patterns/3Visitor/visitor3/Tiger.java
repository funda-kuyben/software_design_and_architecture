public class Tiger implements Animal { // kaplan sinifi
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitTiger(this);
    }

    void roar() {
        System.out.println("Kaplan kükredi: Raaawwr!");
    }
}
