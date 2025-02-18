public class TwentyHandler extends BanknoteHandler {
    @Override
    public void handle(int amount) {
        if (amount >= 20) {
            int count = amount / 20;
            System.out.println(count + " adet 20 TL verildi.");
            amount %= 20;
        }
        if (amount > 0) {
            System.out.println("Kalan tutar islenemedi: " + amount + "TL");
        }
    }
}
