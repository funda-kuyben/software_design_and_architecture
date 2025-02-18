/*Bir veritabani yöneticisi uygulamas geliştirildiğini varsayalım. Uygulamanın temel
işlevi, farklı veri tabanlarına veri eklemek ve veri çekmek olacaktır. Ancak,uygulamayı
kullanan bazı müşteriler MySQL, bazıları ise Oracle veya MSSQL kullanmaktadır. Bu
uygulamada uygulamanın veritabanı türünden bağımsız bir şekilde çalışması
beklenmektedir.
Not: Uygulama, veritabanı türlerine göre farklı veritabanı yönetim sistemleri ile
bağlantı kurmalı ve veri okuma/yazma işlemleri yapmalıdır.*/
public class Main {
    public static void main(String[] args) {
        DBFactory dbFactory = new DBFactory();
        DB mysql = dbFactory.getDB(DBFactory.MYSQL);
        DB oracle = dbFactory.getDB(DBFactory.ORACLE);
        DB mssql = dbFactory.getDB(DBFactory.MSSQL);

        mysql.selectData();
        mysql.insertData();
        oracle.selectData();
        oracle.insertData();
        mssql.selectData();
        mssql.insertData();
    }
}
