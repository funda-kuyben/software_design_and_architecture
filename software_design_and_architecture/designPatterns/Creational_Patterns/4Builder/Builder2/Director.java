/*Director, nesnenin hangi adımlarla oluşturulacağını tanımlar. Örneğin, bir vejetaryen burger veya peynirli burger nasıl oluşturulur, bunu belirler. */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder; // kullanilacak Builder'i belirler
    }

    // vejetaryen Burger oluşturma süreci
    public void constructVeggieBurger() {
        builder.reset();
        builder.setEkmek("Whole Grain"); // tam tahilli ekmek
        builder.setKöfte("Veggie"); // vejetaryen köfte
        builder.setSos("ketchup"); // ketçap sosu
        builder.setPeynir(false); // peynir yok
    }

    // peynirli burger oluşturma süreci
    public void constructCheeseBurger() {
        builder.reset();
        builder.setEkmek("Sesame"); // susamlı ekmek
        builder.setKöfte("beef"); // dana köfte
        builder.setSos("barbecue"); // barbekü sosu
        builder.setPeynir(true); // peynir var
    }
}
/*
 * Director, hangi özelliklerin birleştirileceğini kontrol eder.
 * Örneğin, constructVeggieBurger, bir vejetaryen burger oluşturur.
 */
