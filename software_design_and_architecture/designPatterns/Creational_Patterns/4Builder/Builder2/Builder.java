/*Builder arayüzü, Burger nesnesinin nasıl oluşturulacağını tanımlar. Her bileşeni ayarlamak için metotlar içerir. */
interface Builder {
    void reset(); // yeni bir burger olusturmak icin

    void setEkmek(String ekmek); // ekmek türünü ayarlamak icin

    void setKöfte(String köfte); // köfte türünü ayarlamak icin

    void setSos(String sos); // sos türünü ayarlamak icin

    void setPeynir(boolean peynirli);// peynir eklenip eklenmeyecğini ayarlamak

    Burger getResult(); // sonuc olarak Burger nesnesini döndürmek icin
}
// Burger lar inşa etme