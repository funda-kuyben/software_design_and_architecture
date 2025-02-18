public class Main {
    public static void main(String[] args) {
        HumanResources designerDepartment = new HumanResources("designer department");
        ComponentEmployee designer1 = new Designer(1, "designer1");
        ComponentEmployee designer2 = new Designer(2, "designer2");
        designerDepartment.addEmployee(designer1);
        designerDepartment.addEmployee(designer2);

        HumanResources developerDepartment = new HumanResources("developer depatment");
        ComponentEmployee developer1 = new Developer(3, "developer1");
        ComponentEmployee developer2 = new Developer(4, "developer4");
        developerDepartment.addEmployee(developer1);
        developerDepartment.addEmployee(developer2);

        ComponentEmployee manager = new Manager(5, "manager");

        HumanResources humanResources = new HumanResources("main departman");
        humanResources.addEmployee(designerDepartment);
        humanResources.addEmployee(developerDepartment);
        humanResources.addEmployee(manager);

        humanResources.showInfo();
    }
}
/*
 * Çalışanlar ve insan kaynakları departmanları hiyerarşik bir yapı oluşturmakta
 * ve bütün-parça ilişkisi sayesinde departmanları ve çalışanları aynı yapı
 * içinde modellemektedir.
 */
