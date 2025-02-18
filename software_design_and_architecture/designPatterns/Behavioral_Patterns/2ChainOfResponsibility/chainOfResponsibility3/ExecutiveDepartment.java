public class ExecutiveDepartment implements RequestHandler { // yüksek yönetim
    @Override
    public void handleRequest(double amount) {
        System.out.println("Yüksek yönetim departmani faturayi isledi: " + amount);
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        // son depatman oldugundan gerek yok
    }
}
