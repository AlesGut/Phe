package practice_5_OOP_dz.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public SeaCreature getSeaCreature(Shark shark) {
        return seaCreature;
    }

    public void setSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void demonstrate() {
       if (seaCreature == null) {
            System.out.println("Нулевое значение");
            return;
        }
        seaCreature.move();
    }
}
