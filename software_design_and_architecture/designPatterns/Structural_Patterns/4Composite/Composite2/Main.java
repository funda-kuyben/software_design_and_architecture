public class Main {
    public static void main(String[] args) {
        // yaprak nesneler(Dosyalar
        FileSystemComponent dosya1 = new Dosya("Notlar.txt");
        FileSystemComponent dosya2 = new Dosya("Proje.docx");
        FileSystemComponent dosya3 = new Dosya("Resim.png");

        // bileşik nesne(klasör)
        Klasör anaKlasör = new Klasör("Ana klasör");
        Klasör altKlasör = new Klasör("Alt klasör");

        // klasörlere dosya ve alt klasör ekleme
        anaKlasör.add(dosya1);
        anaKlasör.add(altKlasör);

        altKlasör.add(dosya2);
        altKlasör.add(dosya3);

        // klasör yapısını görüntüleme
        System.out.println("Dosya sistemi yapisi: ");
        anaKlasör.display();
    }
}
