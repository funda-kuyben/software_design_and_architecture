public class Main {
    public static void main(String[] args) {
        // Kullanicilar oluşturuluyor
        Kullanici kullanici1 = new Kullanici("Ali", "ali@example.com");
        Kullanici kullanici2 = new Kullanici("Ayse", "ayse@example.com");

        // sayfa olusturuluyor
        Sayfa sayfa = new Sayfa("teknoloji haberleri");

        // grup oluşturuluyor
        Grup grup = new Grup("Yazilim Gelistiriciler");

        // takipci ekleme
        sayfa.takipciEkle(kullanici1);
        sayfa.takipciEkle(grup);

        // gönderi paylasma
        Post post1 = new Post("Yeni AI Teknolojileri", "Yapay zekada devrim yaratan teknolojiler...", sayfa);
        sayfa.paylas(post1);

        // kullanici da gönderi paylasiyor
        kullanici1.takipciEkle(kullanici2);// Ayse,Ali'yi takip ediyor
        Post post2 = new Post("Java ders notlari", "observer deseni öreneği", kullanici1);
        kullanici1.paylas(post2);
    }
}
