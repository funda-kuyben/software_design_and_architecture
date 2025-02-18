import java.util.ArrayList;
import java.util.List;

//Composite
public class HumanResources implements ComponentEmployee {
    private List<ComponentEmployee> employeeList;
    private String person; // test

    public HumanResources(String person) {
        this.person = person;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(ComponentEmployee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(ComponentEmployee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void showInfo() {
        System.out.println(person);
        for (ComponentEmployee employee : employeeList) {
            employee.showInfo();// alt çalisanin bilgilerini yazdir
        }
    }
}
