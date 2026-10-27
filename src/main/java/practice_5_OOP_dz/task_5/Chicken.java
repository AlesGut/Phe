package practice_5_OOP_dz.task_5;

public class Chicken implements FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Курица, ест зерно ");
    }

    @Override
    public void care() {
        System.out.println("Нуждается в кормушке ");
    }

    @Override
    public void produce() {
        System.out.println("Несет яйца ");
    }
}
