package practice_5_OOP_dz.task_6;

public class BotanicalGarden {
    private Plant plant;

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void demonstrate() {
        plant.care();
    }
}
