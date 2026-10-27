package practice_5_OOP_dz.task_1;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}
