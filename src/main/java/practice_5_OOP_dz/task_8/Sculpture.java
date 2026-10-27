package practice_5_OOP_dz.task_8;

public class Sculpture implements Exhibit {

    @Override
    public void describe() {
        System.out.println("Скульптурный объект");
    }

    @Override
    public void preserve() {
        System.out.println("Реставрация");
    }
}
