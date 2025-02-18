public class Test {

    public static void main(String[] args) {

        Singleton singletonExample1 = Singleton.getInstance();
        Singleton singletonExample2 = Singleton.getInstance();

        System.out.println("singletonExample1 ==> " + singletonExample1);
        System.out.println("singletonExample2 ==> " + singletonExample2);

        System.out.println(singletonExample1 == singletonExample2);
    }
}