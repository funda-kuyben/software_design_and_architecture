public class Dergi extends Mecmua {
    private IRenk renk;
    private IBoyut boyut;

    public Dergi(IRenk renk, IBoyut boyut) {
        this.renk = renk;
        this.boyut = boyut;
    }

    @Override
    public String uret() {
        return "Dergi kapagi Rengi: " + renk.boya() + ",Boyutu: " + boyut.boyutlandir()
                + " olarak belirlendi ve kapak olusturuldu";
    }
}
