public class ORACLE implements DB {
    @Override
    public void selectData() {
        System.out.println("ORACLE veritabanından veri okundu.");
    }

    @Override
    public void insertData() {
        System.out.println("ORACLE veritabanına veri yazıldı.");
    }
}
