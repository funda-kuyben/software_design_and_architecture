/*Bu sınıf tüm alt sistemleri (Mutfak, Servis, Kasa, Temizlik) yönetir ve istemciye kolay bir arayüz sunar. */
public class Restoran {
    private Mutfak mutfak;
    private Servis servis;
    private Kasa kasa;
    private Temizlik temizlik;

    public Restoran() {
        mutfak = new Mutfak();
        servis = new Servis();
        kasa = new Kasa();
        temizlik = new Temizlik();
    }

    public void yemekSiparisVer(String yemek, double tutar, int masaNo) {
        System.out.println("\nSiparis süreci başlatiliyor..");
        mutfak.yemekHazirla(yemek);
        servis.yemekServisEt(yemek);
        kasa.odemeYap(tutar);
        temizlik.masaTemizle(masaNo);
        System.out.println("siparis süreci tamamnlandi.\n");
    }
}
