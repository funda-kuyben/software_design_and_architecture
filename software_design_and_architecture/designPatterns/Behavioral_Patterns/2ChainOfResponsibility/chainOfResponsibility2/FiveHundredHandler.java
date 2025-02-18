public class FiveHundredHandler extends BanknoteHandler { // ConcreteHandler1: 500 TL
    @Override
    public void handle(int amount) {
        if (amount >= 500) {
            int count = amount / 500;
            System.out.println(count + " adet 500 TL verildi.");
            amount %= 500; // kalan tutar
        }
        if (nextHandler != null) {
            nextHandler.handle(amount);
        }
    }
}
