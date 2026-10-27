package practice_5_OOP_dz.task_8;

public class Manuscript implements Exhibit {

    @Override
    public void describe() {
        System.out.println("Древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("требует контролируемой влажности");
    }
}
