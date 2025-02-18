public class Mail implements Iletisim {
    public void bilgiGonder(Kullanici kullanici, String mesaj){
        this.mailGonder(kullanici.GetMail(), mesaj);
    }

    public void mailGonder(String mail, String mesaj){
        System.out.println(mail + " adresine " + mesaj + " gonderilmistir.");
    }
}
