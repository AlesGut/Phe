package practice_5_OOP.task_2;

public class Clothes extends Item {
    private int size;
    private final static int DEFAULT_SIZE = 'M';

    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.size = DEFAULT_SIZE;
    }

    public int getSize() {
        return size;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(", размер" + this.size );
    }

}

