/*Mevcut Sınıf (Adaptee)
Bu sınıf, farklı bir arayüze sahiptir. İstemci, bu sınıfla doğrudan çalışamaz. */
// Video oynatma işlevini sunan sınıf
public class VideoCalar {
    public void videoOynat(String videoAdi) {
        System.out.println("Video oyantiliyor: " + videoAdi);
    }
}
