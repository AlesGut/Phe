package practice_5_OOP.task_1;

public abstract class Transport {
    private double speed;//Скорость км/ч
    private int capaciti;//Вместимость м^3\

    public Transport(int speed, int capaciti) {
        this.speed = speed;
        this.capaciti = capaciti;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapaciti() {
        return this.capaciti;
    }

    abstract void start();
}
