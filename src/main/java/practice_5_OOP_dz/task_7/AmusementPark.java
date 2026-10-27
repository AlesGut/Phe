package practice_5_OOP_dz.task_7;

public class AmusementPark {
   public Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void printInfo(){
        attraction.info();
        attraction.maintain();
    }
}
