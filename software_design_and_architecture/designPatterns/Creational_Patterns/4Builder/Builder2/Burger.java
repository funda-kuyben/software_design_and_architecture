/*
 * Burger sınıfı, oluşturmak istediğimiz karmaşık nesneyi temsil eder. Burger'in
 * bileşenleri vardır: ekmek türü, köfte türü, sos türü ve peynir bilgisi.
 * 
 * java
 * Kodu kopyala
 */
//Karmaşık nesne
public class Burger {
    private String ekmek; // ekmek türü
    private String köfte; // köfte türü
    private String sos; // sos türü
    private boolean peynirli; // peynir var mi?

    // setter metotları:bileşenleri adım adım ayarlamak icin
    public void setEkmek(String ekmek) {
        this.ekmek = ekmek;
    }

    public void setKöfte(String köfte) {
        this.köfte = köfte;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setPeynir(boolean peynirli) {
        this.peynirli = peynirli;
    }

    // Burger'in özelliklerini görmek icin
    @Override
    public String toString() {
        return "Burger [ekmek=" + ekmek + ", köfte=" + köfte + ", sos=" + sos + ", peynirli mi=" + peynirli + "]";
    }
}
