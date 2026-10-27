package practice_5_OOP_dz.task_5;

public class Cow implements FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Корова, ест траву ");
    }

    @Override
    public void care() {
        System.out.println("Выпас ");
    }

    @Override
    public void produce() {
        System.out.println("Дает имолоко");
    }
}
