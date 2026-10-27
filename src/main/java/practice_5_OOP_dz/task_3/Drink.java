package practice_5_OOP_dz.task_3;

public class Drink implements Dish {
    private int volume;
    private String name;

    public Drink(String name, int volume) {
        this.volume = volume;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println("Объем напитка " + getVolume() + " Название " + getName());
    }
}
