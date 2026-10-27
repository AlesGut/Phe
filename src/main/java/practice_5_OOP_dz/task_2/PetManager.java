package practice_5_OOP_dz.task_2;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void interact() {
        if (pet == null) {
            System.out.println("В зоопарке нет животных");
            return;
        }
        pet.eat();
        pet.play();
    }
}
