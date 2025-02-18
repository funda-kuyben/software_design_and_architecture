public class Kanal {
    private String isim, link;// Kanal adi ve bağlantı linki

    // Kanal nesnesi oluşturulurken adı ve linki ayarlanir
    public Kanal(String isim, String link) {
        setIsim(isim);
        setLink(link);
    }

    // getter ve setter metodları
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}