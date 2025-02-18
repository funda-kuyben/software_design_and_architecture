public class Main {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("bu nesneler birbiri ile ayni");
        } else {
            System.err.println("nesneler farkli");
        }
    }
}
