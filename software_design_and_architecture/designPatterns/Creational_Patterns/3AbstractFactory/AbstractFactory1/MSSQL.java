public class MSSQL implements DB {
    @Override
    public void selectData() {
        System.out.println("MSSQL veritabanindan veri okundu.");
    }

    @Override
    public void insertData() {
        System.out.println("MSSQL veritabanina veri yazildi.");
    }
}
