public class AccountingDepartment implements RequestHandler { // muhasebe
    private RequestHandler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount <= 1000) {
            System.out.println("Muhasebe departmani faturayi isledi:" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
/*
 * ConcreteHandler Sınıfları (Muhasebe, Yönetici, Yüksek Yönetim)
 * Her bir departman, bu arayüzü uygular ve kendi yetki sınırlarına göre
 * işlemleri işleyip bir sonraki departmana yönlendirir.
 */
