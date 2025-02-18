//Leaf: Dosya sınıfı
public class Dosya implements FileSystemComponent {
    private String isim;

    public Dosya(String isim) {
        this.isim = isim;
    }

    @Override
    public void display() {
        System.out.println("Dosya: " + isim);
    }
}
