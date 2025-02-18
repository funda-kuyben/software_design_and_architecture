public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ICar bmw = CarFactory.createCar("BMW", "siyah", 240000, 2016, true);
        ICar audi = CarFactory.createCar("Audi", "beyaz", 194000, 2018, false);

        bmw.showCarInfo();
        System.out.println(" ");
        audi.showCarInfo();
    }
}
