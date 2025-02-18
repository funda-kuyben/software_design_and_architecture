public class Bird implements Animal { // kuş sınıfı
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitBird(this);
    }

    void fly() {
        System.out.println("Kus ucuyor: kanat cirpiyor!");
    }
}
