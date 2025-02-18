public class MainActivity implements Activity {
    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.getMediaPlayer(); // Singleton MediaPlayer nesnesini alır
    }

    public void oynat(Kanal kanal) {
        mediaPlayer.kanalSec(kanal); // kanali sec
        mediaPlayer.oynat(); // oynatmayı başlat
    }

    public void durdur() {
        mediaPlayer.durdur(); // oynatmayı durdur
    }
}