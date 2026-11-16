package practice_7_dz.collection.ArrayDeque_dz3;

public class Main {
    public static void main(String[] args) {
        ArrayDequeLastFirst arrayDequeLastFirst = new ArrayDequeLastFirst();
        arrayDequeLastFirst.addLastDeQueue("D");
        arrayDequeLastFirst.addLastDeQueue("F");
        arrayDequeLastFirst.addLastDeQueue("G");
        arrayDequeLastFirst.addFirstDeQueue("C");
        arrayDequeLastFirst.addFirstDeQueue("B");
        arrayDequeLastFirst.addFirstDeQueue("A");

        arrayDequeLastFirst.printFirstDeQueue();
        arrayDequeLastFirst.printFirstDeQueue();
        arrayDequeLastFirst.printLastDeQueue();
        arrayDequeLastFirst.printLastDeQueue();


        //arrayDequeLastFirst.printAllFirstDeQueue();
    }
}
