//Composite: Klasör sinifi

import java.util.ArrayList;
import java.util.List;

public class Klasör implements FileSystemComponent {
    private String isim;
    private List<FileSystemComponent> icerikler = new ArrayList<>();

    public Klasör(String isim) {
        this.isim = isim;
    }

    public void add(FileSystemComponent component) {
        icerikler.add(component);
    }

    public void remove(FileSystemComponent component) {
        icerikler.remove(component);
    }

    public FileSystemComponent getChild(int index) {
        return icerikler.get(index);
    }

    @Override
    public void display() {
        System.out.println("Klasör: " + isim);
        for (FileSystemComponent component : icerikler) {
            component.display(); // alt bileşenlerin display() metodunu cagırır
        }
    }
}
