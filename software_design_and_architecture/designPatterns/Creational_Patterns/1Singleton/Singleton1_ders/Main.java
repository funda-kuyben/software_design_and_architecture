public class Main {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        ListeActivity listeActivity = new ListeActivity();

        mainActivity.onCreate(); // Medya oynatıcı nesnesi oluşturulur
        listeActivity.onCreate();// Kanal listesi oluşturulur

        Kanal kanal = listeActivity.kanalSec(0); // ilk kanalı seç
        mainActivity.oynat(kanal); // ilk kanalı oynat
        Main.sleep(5000); // 5 saniye bekle

        kanal = listeActivity.kanalSec(1); // ikinci kanalı seç
        mainActivity.durdur(); // ilk kanalı durdur
        mainActivity.oynat(kanal); // ikinci kanalı oynat
    }

    public static void sleep(int sure) {
        try {
            Thread.sleep(sure); // bekleme süresi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
