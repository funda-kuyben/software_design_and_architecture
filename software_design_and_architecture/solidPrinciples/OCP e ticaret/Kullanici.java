import java.util.ArrayList;
import java.util.List;

public abstract class Kullanici {
    protected int id;
    protected String isim;
    protected String mail;
    protected List<Urun> urunler;

    public Kullanici() {
        urunler = new ArrayList<Urun>();
    }

    public abstract double getToplamTutar(double fiyat);

    public String getIsim() {
        return isim;
    }

    public List<Urun> getUrunler() {
        return urunler;
    }

    public Urun getUrun(int index) {
        return getUrunler().get(index);
    }

    public void addUrun(Urun urun) {
        getUrunler().add(urun);
    }
}
