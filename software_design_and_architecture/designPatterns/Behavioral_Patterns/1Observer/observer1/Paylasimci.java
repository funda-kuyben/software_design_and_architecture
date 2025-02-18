import java.util.ArrayList;
import java.util.List;

public abstract class Paylasimci { // gözlenen,subject
    // abstract sınıf ile alt sınıfları abstract metodunu illa override etmeli
    private String isim;
    private List<Takipci> takipciListe;

    public Paylasimci(String isim) {
        setIsim(isim);
        takipciListe = new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void takipciEkle(Takipci takipci) {
        takipciListe.add(takipci);
    }

    public void takipciCikar(Takipci takipci) {
        takipciListe.remove(takipci);
    }

    public void tumunuBilgilendir(Post post) {
        for (Takipci takipci : takipciListe) {
            takipci.bilgilendir(post);
        }
    }

    public abstract void paylas(Post post);
}
