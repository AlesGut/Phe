package practice_5_OOP.task_2;

public class Electronics extends Item {
    private final static int DEFAULT_GARANTEE = 2;
    private int quarantee;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.quarantee = DEFAULT_GARANTEE;
    }

    public int getQuarantee() {
        return quarantee;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(", гарантия" + this.quarantee + ", года");
    }

}
