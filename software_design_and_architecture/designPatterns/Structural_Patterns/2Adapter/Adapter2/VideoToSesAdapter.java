/* Adapter Sınıfı
Adapter, mevcut sınıfı (Adaptee) hedef arayüze (Target) uyumlu hale getirir. */
// VideoCalar sınıfını SesCalar arayüzüne uyarlayan adapter
public class VideoToSesAdapter implements SesCalar {
    private VideoCalar videoCalar;

    // constructor ile VideoCalar sınıfını alıyoruz
    public VideoToSesAdapter(VideoCalar videoCalar) {
        this.videoCalar = videoCalar;
    }

    @Override
    public void sesOynat(String dosyaAdi) {
        // video oynatmayi ses çalma olarak uyarliyoruz
        videoCalar.videoOynat(dosyaAdi);
    }
}
