public class BMW implements ICar {
    // arabadaki özellikleri belirledik
    private String color;
    private double price;
    private int modelYear;
    private boolean backupCamera;

    public BMW(String color, double price, int modelYear, boolean backupCamera) {
        this.color = color;
        this.price = price;
        this.modelYear = modelYear;
        this.backupCamera = backupCamera;
    }

    // ICar Interface'indeki metotlar override edilir :
    // Bu metotlar yardımı ile nesne özelliklerine erişilebilir.
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int modelYear() {
        return modelYear;
    }

    @Override
    public boolean backupCamera() {
        return backupCamera;
    }

    @Override
    public void showCarInfo() {
        System.out.println("Araba markasi: BMW");
        System.out.println("Araba Fiyati : " + price);
        System.out.println("Araba Model Yili : " + modelYear);
        if (backupCamera) {
            System.out.println("arka kamera özelliği: var");
        } else {
            System.out.println("arka kamera özelliği: yok");
        }
    }
}
