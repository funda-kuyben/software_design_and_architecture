public class Kullanici {
    private String isim;
    private String mail;
    private Adres adres;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdres() {
        return adres.toString();
    }

    public void adresGuncelle(Adres adres) {
        this.adres = adres;
    }

    public String toString() {
        return getIsim() + " " + getMail() + " " + getAdres();
    }

    public void girisYap(String mail, String sifre) {
        System.out.println("Giris yapildi.");
    }
}
