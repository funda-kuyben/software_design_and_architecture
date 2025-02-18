public class Sayfa extends Paylasimci {
    public Sayfa(String isim) {
        super(isim); // üst sınıfın yapıcı metotalarını çağırır.
    }

    @Override
    public void paylas(Post post) {
        System.out.println(getIsim() + " sayfasi " + post.getBaslik() + "paylasti.");
        tumunuBilgilendir(post);
    }
}
