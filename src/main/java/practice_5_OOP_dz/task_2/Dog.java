package practice_5_OOP_dz.task_2;

public class Dog implements Pet {
    private String name;
    private String food;

    public Dog(String name, String food) {
        this.food = food;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void play() {
        System.out.println(name + " Гулять");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест " + food);
    }
}
