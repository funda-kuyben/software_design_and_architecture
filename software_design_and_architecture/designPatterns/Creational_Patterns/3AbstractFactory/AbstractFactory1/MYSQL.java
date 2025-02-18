public class MYSQL implements DB {
    @Override
    public void selectData() {
        System.out.println("MYSQL veritabanindan veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("MYSQL veritabanina veri yazildi");
    }
}
