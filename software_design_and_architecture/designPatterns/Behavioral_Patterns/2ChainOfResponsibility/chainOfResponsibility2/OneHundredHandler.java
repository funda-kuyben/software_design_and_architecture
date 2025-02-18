public class OneHundredHandler extends BanknoteHandler { // ConcreteHandler 3: 100 TL
    @Override
    public void handle(int amount) {
        if (amount >= 100) {
            int count = amount / 100;
            System.out.println(count + " adet 100 TL verildi.");
            amount %= 100;
        }
        if (nextHandler != null) {
            nextHandler.handle(amount);
        }
    }
}
