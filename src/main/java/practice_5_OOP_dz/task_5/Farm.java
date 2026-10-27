package practice_5_OOP_dz.task_5;

public class Farm {
    FarmAnimal farmAnimal;

    public FarmAnimal getFarmAnimal() {
        return farmAnimal;
    }

    public void setFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void demonstrate() {
        farmAnimal.feed();
        farmAnimal.produce();
        farmAnimal.care();

    }
}
