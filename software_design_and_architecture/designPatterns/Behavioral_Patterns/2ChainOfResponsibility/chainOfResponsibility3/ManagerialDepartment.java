public class ManagerialDepartment implements RequestHandler { // yönetici
    private RequestHandler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount > 1000 && amount <= 5000) {
            System.out.println("Yönetici departmani faturayi isledi: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
