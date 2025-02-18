public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici();
        kullanici.setIsim("Funda Kuyben");
        kullanici.setMail("funda@gmail.com");

        Adres adres = new Adres();
        adres.setUlke("Turkiye");
        adres.setIl("Mugla");
        adres.setIlce("Fethiye");

        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());

        adres.setPostKodu(62000);
        kullanici.adresGuncelle(adres);

        System.out.println(kullanici.toString());
    }
}
