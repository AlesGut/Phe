package pracktice_3_dz;

public class Compani {
    static String companyName; //общее название для всех сотрудников
    final int EMPLOYEE_ID; // уникальный идентификатор (нельзя менять)
    String employeeName; // имя сотрудника

    static {
        companyName = "Yandex";
    }

    Compani(String someEmoloyName, int someEmployeeID) { //конструктор класса Compani
        this.employeeName = someEmoloyName;
        this.EMPLOYEE_ID = someEmployeeID;

    }

    String getEmployeeName() {  // геттер поля employeeName
        return this.employeeName;
    }

    void setEmployeeName(String employeeName) { //сеттер поля employeeName
        this.employeeName = employeeName;
    }

    int getEMPLOYEE_ID() {  // петтер поля employeeID
        return this.EMPLOYEE_ID;
    }

    static void printCompanyName() { // метод для вызова печати
        System.out.println("Сотрудник компании " + companyName);
    }

    void printCompani() { // метод для вызова печати
        printCompanyName();
        System.out.println("Имя сотрудника " + getEmployeeName() + ", ID Сотрудника " + getEMPLOYEE_ID());
    }

    // void noEmployeeID() {
    //     employeeID = 12;
    // }
}
