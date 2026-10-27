package practice_5_OOP_dz.task_7;

public class Main {
    public static void main(String[] args) {
        AmusementPark attraction = new AmusementPark();
      attraction.setAttraction(new Carousel());
      attraction.printInfo();
      attraction.setAttraction(new RollerCoaster());
      attraction.printInfo();
    }
}
