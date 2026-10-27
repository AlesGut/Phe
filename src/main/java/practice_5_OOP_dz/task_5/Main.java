package practice_5_OOP_dz.task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.setFarmAnimal(new Cow());
        farm.demonstrate();
        farm.setFarmAnimal(new Chicken());
        farm.demonstrate();
    }
}
