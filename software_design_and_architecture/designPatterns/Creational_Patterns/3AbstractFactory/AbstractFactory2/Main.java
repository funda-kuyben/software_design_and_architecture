public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        IAbstractFactory audiFactory = new AudiFactory();
        IAbstractFactory bmwFactory = new BMWFactory();

        ICar audiCar = audiFactory.createCar("beyaz", 5000);
        ICar bmwCar = bmwFactory.createCar("siyah", 4200);

        IMotorCycle audiMotorCycle = audiFactory.createMotorCycle("yaris motoru", 320);
        IMotorCycle bmwMotorCycle = bmwFactory.createMotorCycle("caddde motoru", 240);
    }
}
