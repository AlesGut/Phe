package practice_5_OOP_dz.task_1;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void showAnimal(){
        if (animal ==null){
            System.out.println("В зоопарке нет животных");
            return;
        }
        animal.makeSound();
        animal.move();
    }

}
