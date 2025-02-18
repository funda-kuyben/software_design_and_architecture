public class MediaPlayer implements Runnable {
    private Kanal kanal; // oynatılacak kanal bilgisi
    private boolean kontrol; // oynatma durumu
    private static MediaPlayer mediaPlayer;// tek nesne

    // Singleton örneği döndüren metot
    public static MediaPlayer getMediaPlayer() {
        if (mediaPlayer == null) {// eğer nesne yoksa oluştur
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer; // mevcut nesneyi döndür
    }

    // yapici metod,private olduğu için dışarıdan çağrılmaz
    private MediaPlayer() {
    }

    public void kanalSec(Kanal kanal) {
        this.kanal = kanal;
    }

    public void oynat() {
        kontrol = true;
        new Thread(this).start(); // yeni bir thread'de oynatma başlar
    }

    public void durdur() {
        kontrol = false;
    }// oynatmayı durdur

    @Override
    public void run() {
        while (kontrol) { // oynatma durumu true olduğu sürece çalışır
            Main.sleep(2000); // 2 sn bekle
            System.out.println(kanal.getIsim() + "kanali" + kanal.getLink() + "linki üzerinden oynatiliyor.");
        }
    }
}