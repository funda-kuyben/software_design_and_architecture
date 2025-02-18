public class ConcreteBuilder implements Builder {
    private Burger burger;

    // yeni bir Burger başlatılır.
    public ConcreteBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.burger = new Burger(); // yeni bir Burger nesnesi olusturulur
    }

    @Override
    public void setEkmek(String ekmek) {
        burger.setEkmek(ekmek); // ekmek türü ayarlanir
    }

    @Override
    public void setKöfte(String köfte) {
        burger.setKöfte(köfte);
    }

    @Override
    public void setSos(String sos) {
        burger.setSos(sos);
    }

    @Override
    public void setPeynir(boolean peynirli) {
        burger.setPeynir(peynirli); // peynir bilgisi ayarlanir
    }

    @Override
    public Burger getResult() {
        return this.burger; // tamamlanmış Burger nesnesini döndürür
    }
}
