package practice_7_dz.arrayList.TreeMap_dz3;

public class Main {
    public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();
        employeeMap.addEmployees(10, "Коля");
        employeeMap.addEmployees(11, "Ангела");
        employeeMap.addEmployees(12, "Фридрих");
        employeeMap.addEmployees(13, "Расул");
        employeeMap.addEmployees(14, "Филя");
        employeeMap.addEmployees(15, "Филя");
        employeeMap.addEmployees(16, "Филя");
        employeeMap.addEmployees(17, "Филя");
        employeeMap.printAll();
        employeeMap.lastEmployes(12);
        employeeMap.firstEmployee(15);
    }
}
