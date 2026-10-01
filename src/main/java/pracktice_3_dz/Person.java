package pracktice_3_dz;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn; // номер социального страхования

    Person(String someLastName, String someFirstName, String someSsn) {// конструктор класса Person
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    String getFirstName() { //геттер  для переменной  firstName
        return firstName;
    }

    String getLastName() { //геттер  для переменной   lastName
        return lastName;
    }

    String getSsn() { //геттер для переменной  ssn
        return ssn;
    }

    void setFirstName(String newFirstName) { // сеттер firstName
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {// сеттер lastName
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Имя " + this.lastName + ", Фамилия " + this.firstName + ", SSN " + this.ssn);
    }
}
