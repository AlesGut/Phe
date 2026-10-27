package practice_5_OOP_dz.task_3;

public class Menu {
    private Dish dish;

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void printMenu() {
        if (dish == null) {
            System.out.println("Пустое ззначение");
            return;
        }

        dish.print();

    }
}
