public class Grup implements Takipci {
    private String isim;

    public Grup(String isim) {
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " grup üyelerine " + post.getPaylasimci().getIsim()
                + " 'in paylaşimi mail olarak gönderildi.");
    }
}
