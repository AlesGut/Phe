package practice_5_OOP_dz.task_7;

public class RollerCoaster implements Attraction {
    @Override
    public void info() {
        System.out.println("Американские горки, острые ощущения");
    }
    @Override
    public void maintain() {
        System.out.println("проверка безопасности");
    }
}
