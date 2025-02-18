public class Main { // client(müsteri)
    public static void main(String[] args) {
        // zinciri olustur
        BanknoteHandler fiveHundred = new FiveHundredHandler();
        BanknoteHandler twoHundred = new TwoHundredHandler();
        BanknoteHandler oneHundred = new OneHundredHandler();
        BanknoteHandler fifty = new FiftyHandler();
        BanknoteHandler twenty = new TwentyHandler();

        // zinciri bagla
        fiveHundred.setNextHandler(twoHundred);
        twoHundred.setNextHandler(oneHundred);
        oneHundred.setNextHandler(fifty);
        fifty.setNextHandler(twenty);

        // Test: 1350 TL cekme
        System.out.println("1350 TL cekiliyor:");
        fiveHundred.handle(1350);

        System.out.println("\n870 TL cekiliyor");
        fiveHundred.handle(870);

        System.out.println("\n45 TL cekiliyor:");
        fiveHundred.handle(45);
    }
}
