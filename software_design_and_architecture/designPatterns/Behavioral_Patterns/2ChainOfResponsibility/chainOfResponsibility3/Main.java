public class Main {
    public static void main(String[] args) {
        // Zinciri oluşturup departmanları birbirine bağlayarak işlemi başlatıyoruz.

        // departmanlar
        RequestHandler accounting = new AccountingDepartment();
        RequestHandler managerial = new ManagerialDepartment();
        RequestHandler executive = new ExecutiveDepartment();

        // Zincirleme
        accounting.setNextHandler(managerial);
        managerial.setNextHandler(executive);

        // fatura talepleri
        System.out.println("Fatura işlemine basla:");

        accounting.handleRequest(500);// muhasebe departmanı islemi yapar
        accounting.handleRequest(3000); // yönetici depatmanı islemi yapar
        accounting.handleRequest(7000);// yüksek yönetim departmani işlemi yapar

    }
}
/*
 * Faturalar Yönetimi
 * Bir şirketin farklı departmanları, gelen faturaları işlemektedir.
 * Faturalar, farklı kurallar ve limitler doğrultusunda çeşitli departmanlara
 * yönlendirilir:
 * 
 * Muhasebe Departmanı: Küçük miktarlı faturaları işler.
 * Yönetici Departmanı: Orta boyutlu faturaları işler.
 * Yüksek Yönetim: Büyük miktarlı faturaları işler.
 * Her departman, işlemi kendisi çözemiyorsa, bir sonraki departmana
 * yönlendirir.
 * 
 */