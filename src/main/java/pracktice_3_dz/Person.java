package pracktice_3_dz;

public class Person {
    private String firstName;
    private String lastName;
    private final String SSN; // номер социального страхования

    Person(String someLastName, String someFirstName, String someSSN) {// конструктор класса Person
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.SSN = someSSN;
    }

    String getFirstName() { //геттер  для переменной  firstName
        return firstName;
    }

    String getLastName() { //геттер  для переменной   lastName
        return lastName;
    }

    String getSsn() { //геттер для переменной  ssn
        return SSN;
    }

    void setFirstName(String newFirstName) { // сеттер firstName
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {// сеттер lastName
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Имя " + this.lastName + ", Фамилия " + this.firstName + ", SSN " + this.SSN);
    }
}
