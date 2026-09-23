package pracktice_2;

public class Main {
    public static void main(String[] args) {
        // Проверка конструктора по умолчанию
        Student petva = new Student(18, "Петя");
        petva.print();

        Student kolva = new Student(20, "Коля");
        kolva.print();
        kolva.name = "Генадий";
        kolva.print();

        petva.setName("Антон");
        System.out.println("Новое имя Петя: " + petva.name);

        kolva.setName("Паша");
        System.out.println("Новое имя Коли: " + kolva.name);
    }
}
