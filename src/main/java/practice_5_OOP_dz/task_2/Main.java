package practice_5_OOP_dz.task_2;

public class Main {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();
        petManager.setPet(new Dog("Рекс", "сухой корм"));
        petManager.interact();
        petManager.setPet(new Cat("Мурка", "влажный корм"));
        petManager.interact();
    }
}
