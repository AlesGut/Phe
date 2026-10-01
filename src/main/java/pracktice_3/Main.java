package pracktice_3;

public class Main {
    public static void main(String[] args) {
        // создали переменную
        // присвоили переменной экземпляр класса Студент
        // вызвав дефолтный конструктор по умолчанию
        System.out.println(Student.studentCount);
        Student petya = new Student(18, "Петя");
        System.out.println(Student.studentCount);
        Student colva = new Student(20, "Коля");
        System.out.println(Student.studentCount);

        Student.printMaxYears();//статический метод

        System.out.println(petya.age);// переменная объкта
        System.out.println(colva.age);
        System.out.println(Student.MAX_YEARS);
    }
}
