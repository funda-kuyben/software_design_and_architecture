/*
 * Senaryo: Medya Oynatıcı
 * İstemci sadece bir "Ses Çalar" arayüzüyle çalışabilir.
 * Ancak elimizde bir "Video Çalar" sınıfı var.
 * Adapter sayesinde Video Çalar sınıfı, Ses Çalar arayüzüne uyarlanır ve
 * istemci tarafından kullanılabilir.
 */
public class Main {
    public static void main(String[] args) {
        // mevcut VideoCalar sinifi
        VideoCalar videoCalar = new VideoCalar();

        // VideoCalar sinifini SesCalar arayüzüne uyarliyoruz
        SesCalar sesCalarAdapter = new VideoToSesAdapter(videoCalar);

        // istemci, SesCalar arayüzünü kullanarak dosyayi çalar
        sesCalarAdapter.sesOynat("film.mp4");
    }
}