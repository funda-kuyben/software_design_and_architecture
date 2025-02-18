public class Book implements Item { // Concrete Element: Kitap
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
