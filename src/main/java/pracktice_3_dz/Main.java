package pracktice_3_dz;

public class Main {
    public static void main(String[] args) {
        Compani petia = new Compani("Петя", 54321); // создание объекта petia
        petia.printCompani();

        Compani nata = new Compani("Наташа", 431234); // создание объекта nata
        nata.printCompani();

        Compani.companyName = "Sber"; //изменение компании для всех
        nata.printCompani();
        petia.printCompani();
        System.out.println(" Окончание задания Класс Company");

        MathConstants.calculateCircleArea(13.12);
        MathConstants.calculateExponentialGrowth(12, 12, 12);
        System.out.println("Окончание задания Класс MathConstants");


        University student1 = new University(456, "Анатолий"); // создание объекта student1
        University student2 = new University(7654, "Елена");// создание объекта student2
        University student3 = new University(87654, "Кирил");// создание объекта student3

        student1.printStudentInfo();
        student2.printStudentInfo();
        University.universityName = "Шарага"; // изменение статического параметра
        student3.printStudentInfo();
        System.out.println("Окончани Класс University");
        GameSettings game1 = new GameSettings("BDO", 10000); // создание объекта game1
        GameSettings geme2 = new GameSettings("Tank", 10000); // создание объекта game2
        game1.printGameStatus();
        geme2.addPlayer();
        geme2.addPlayer();
        GameSettings.setMaxPlayers(90000); // изменение максимального числа игроков
        geme2.printGameStatus();
        System.out.println("Окончание Класс GameSettings");

        Person person1 = new Person("Петр", "Иванов", "23423424-76657-45674"); // создание объекта person1
        Person person2 = new Person("Яша", "Казимиров", "3242434-762342347-4556456774"); // создание объекта person2
        person1.printPersonInfo();
        person2.setLastName("Гриша"); // изменение параметра lastName
        person2.setFirstName("Николаев"); // изменение параметра firstName
        person2.printPersonInfo();

    }


}
