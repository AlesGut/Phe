package practice_5_OOP.task_2;

public class Main {
    public static void main(String[] args) {
        Item muq = new Item("Кружка", 100, 2);
        Item micropchone = new Electronics("Микрофон", 10000, 1);
        Item dress = new Clothes("Платье", 5000, 3);

        Manager kostya = new Manager();

        kostya.manager(muq);
        kostya.manager(micropchone);
        kostya.manager(dress);
    }


}


