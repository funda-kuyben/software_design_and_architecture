/*Bir uygulama aracılığıyla kitap ve dergi kapakları oluşturulacaktır.
● Kitap ve dergi kapaklarının birden fazla renkte (kırmızı, beyaz) ve boyutta (a4, a5) üretilebilmesi istenmektedir.
Böyle bir mecmua (kitap,dergi) üretim sürecini Bridge tasarım deseni ile modelleme */
public class Program {
    public static void main(String[] args) {
        // kitap kapagi üretelim
        IRenk secilen_renk = new Beyaz();
        IBoyut secilen_boyut = new A4();

        Mecmua kitap = new Kitap(secilen_renk, secilen_boyut);
        String kitap_kapagi = kitap.uret();

        System.out.println(kitap_kapagi);

        // dergi kapagi üretelim, farklı renk ve boyut ile
        secilen_renk = new Kirmizi();
        secilen_boyut = new A5();

        Mecmua dergi = new Dergi(secilen_renk, secilen_boyut);
        String dergi_kapagi = dergi.uret();

        System.out.println(dergi_kapagi);
    }
}