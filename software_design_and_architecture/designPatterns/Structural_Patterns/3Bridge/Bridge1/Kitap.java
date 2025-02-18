public class Kitap extends Mecmua {
    private IRenk renk;
    private IBoyut boyut;

    public Kitap(IRenk renk, IBoyut boyut) {
        this.renk = renk;
        this.boyut = boyut;
    }

    @Override
    public String uret() {
        return "Kitap kapagi Rengi: " + renk.boya() + ",Boyutu: " + boyut.boyutlandir()
                + "olarak belirlendi ve kapak olusturuldu.";
    }
}
