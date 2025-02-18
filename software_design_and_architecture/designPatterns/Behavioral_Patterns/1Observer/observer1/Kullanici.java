public class Kullanici extends Paylasimci implements Takipci {
    private String mail;

    public Kullanici(String isim, String mail) {
        super(isim);
        setMail(mail);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void paylas(Post post) {
        System.out.println(getIsim() + " kullanici " + post.getBaslik() + " paylasti.");
    }

    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " kullanicisina " + post.getPaylasimci().getIsim()
                + "'in yaptigi paylasim mesaj olarak gönderildi");
    }
}
