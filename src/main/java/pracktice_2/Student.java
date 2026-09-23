package pracktice_2;

public class Student {
    int age = 12;
    String name = "Петяzz";

    // Конструктор
    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    // геттер для поля возраст age
    int getAge() {
        return this.age;
    }

    // геттер для поля name
    String getName() {
        return this.name;

    }

    //сеттер для поля age
    void setAge(int newAge) {
        this.age = newAge;
    }

    //сеттер для поля age
    void setName(String newName) {
        this.name = newName;
    }
    void print(){
        System.out.println("Возраст " + this.age + ", имя " + this.name);
    }
}
