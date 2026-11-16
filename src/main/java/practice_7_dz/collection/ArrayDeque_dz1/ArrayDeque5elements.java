package practice_7_dz.collection.ArrayDeque_dz1;

import java.util.ArrayDeque;

public class ArrayDeque5elements {
    private ArrayDeque<String> elements5;

    public ArrayDeque5elements() {
        this.elements5 = new ArrayDeque<>();
        elements5.add("A");
        elements5.add("B");
        elements5.add("C");
        elements5.add("D");
        elements5.add("E");
    }

    public void printElements5() {
        while (!elements5.isEmpty()) {
            System.out.println(elements5.poll());
        }
    }
}
