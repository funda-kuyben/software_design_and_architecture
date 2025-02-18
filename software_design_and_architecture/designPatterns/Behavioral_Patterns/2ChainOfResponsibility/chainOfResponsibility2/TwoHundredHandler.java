public class TwoHundredHandler extends BanknoteHandler { // ConcreteHandler 2: 200 TL
    @Override
    public void handle(int amount) {
        if (amount >= 200) {
            int count = amount / 200;
            System.out.println(count + " adet 200 TL verildi.");
            amount %= 200;
        }
        if (nextHandler != null) {
            nextHandler.handle(amount);
        }
    }
}
