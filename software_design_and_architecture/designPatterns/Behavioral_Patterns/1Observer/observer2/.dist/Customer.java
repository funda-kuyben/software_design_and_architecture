public class Customer implements Member { // ConcreteObserver: üye
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.println("hello" + name + ", the price of " + productName + " has changed to $" + newPrice);
    }
}
