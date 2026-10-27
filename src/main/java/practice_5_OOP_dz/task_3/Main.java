package practice_5_OOP_dz.task_3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        menu.setDish(new HotDish("Борщ", 23));
        menu.printMenu();
        menu.setDish(new Drink("Кола", 40));
        menu.printMenu();
    }

}
