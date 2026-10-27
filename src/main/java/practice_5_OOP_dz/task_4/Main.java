package practice_5_OOP_dz.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.demonstrate();
        aquarium.setSeaCreature(new Shark());
        aquarium.demonstrate();
        aquarium.setSeaCreature(new Starfish());
        aquarium.demonstrate();
    }
}
