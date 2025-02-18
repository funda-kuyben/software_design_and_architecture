public class CarFactory { // Factory Class
    // Factory Method, newInstance() ile:
    public static ICar createCar(String mark, String color, double price, int modelYear, boolean backupCamera) {
        ICar car;
        if (mark.equals("BMW")) {
            car = new BMW(color, price, modelYear, backupCamera);
        } else if (mark.equals("Audi")) {
            car = new Audi(color, price, modelYear, backupCamera);
        } else {
            throw new RuntimeException(mark + "markasinin üretimi desteklenmemektedir");
        }
        return car;
    }
}
