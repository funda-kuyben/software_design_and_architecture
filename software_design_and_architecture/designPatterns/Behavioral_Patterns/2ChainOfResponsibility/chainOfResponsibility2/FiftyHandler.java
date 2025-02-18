public class FiftyHandler extends BanknoteHandler { // ConcreteHandler 4: 50 TL
    @Override
    public void handle(int amount) {
        if (amount >= 50) {
            int count = amount / 50;
            System.out.println(count + " adet 50 TL verildi.");
            amount %= 50;
        }
        if (nextHandler != null) {
            nextHandler.handle(amount);
        }
    }
}
