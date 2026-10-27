package practice_5_OOP_dz.task_3;

public class HotDish implements Dish {
    private String name;
    private int temperature;

    public HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void print() {
        System.out.println("Температура " + getTemperature() + " Название " + getName());

    }
}
