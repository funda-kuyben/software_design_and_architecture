public class BMWMotorcycle implements IMotorCycle {
    private String type;
    private double price;

    public BMWMotorcycle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
