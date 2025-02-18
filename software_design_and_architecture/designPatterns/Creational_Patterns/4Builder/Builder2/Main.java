//Director ve Builder'ı kullanarak Burger oluştururuz.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // ConcreteBuilder kullanarak Burger oluşturuyoruz
        Builder builder = new ConcreteBuilder();
        director.setBuilder(builder);

        // vejetaryen Burger oluştur
        director.constructVeggieBurger();
        Burger veggieBurger = builder.getResult();
        System.out.println("veggie burger: " + veggieBurger);

        // peynirli Burger oluştur
        director.constructCheeseBurger();
        Burger cheeseBurger = builder.getResult();
        System.out.println("cheese burger: " + cheeseBurger);
    }
}
