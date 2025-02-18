public abstract class BanknoteHandler { // Handler(Soyut Sinif)
    protected BanknoteHandler nextHandler; // Zincirdeki bir sonraki işleyici

    public void setNextHandler(BanknoteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int amount); // islenecek tutar
}