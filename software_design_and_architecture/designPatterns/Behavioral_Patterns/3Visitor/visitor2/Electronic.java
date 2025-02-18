public class Electronic implements Item {// Concrete Element: Elektronik
    private String name;
    private double price;

    public Electronic(String name, double price) {
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
