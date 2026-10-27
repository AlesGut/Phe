package practice_5_OOP.task_1;

public class Dispatcher {
    public void control(Transport transport) {
        transport.start();
    }
    public void printTransportDetails(Transport transport) {
        System.out.println("Скорость транспорта" + transport.getCapaciti());
        System.out.println("Вместимость транспорта" + transport.getSpeed());
    }
}