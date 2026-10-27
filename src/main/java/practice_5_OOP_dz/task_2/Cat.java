package practice_5_OOP_dz.task_2;

public class Cat implements Pet {
    private String name;
    private String food;

    public Cat(String name, String food) {
        this.food = food;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }
@Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }
}
