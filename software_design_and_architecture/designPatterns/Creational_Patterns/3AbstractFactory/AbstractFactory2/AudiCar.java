public class AudiCar implements ICar {
    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
