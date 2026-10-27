package practice_5_OOP_dz.task_7;


public class Carousel implements Attraction {


    @Override
    public void info() {
        System.out.println("Каруcель, спокойный отракцион");
    }

    @Override
    public void maintain() {
        System.out.println("техническое обслуживание");
    }
}