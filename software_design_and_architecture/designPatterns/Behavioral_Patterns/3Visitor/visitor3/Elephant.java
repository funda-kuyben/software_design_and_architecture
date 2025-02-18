public class Elephant implements Animal { // fil sınıfı
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitElephant(this);
    }

    void trumpet() {
        System.out.println("Fil borazan sesi çikardi: Tuuuutttt!");
    }
}
