package practice_7_dz.collection.ArrayDeque_dz2;

import java.util.ArrayDeque;

public class ArrayDequeStack5 {
    private ArrayDeque<Integer> stack5;

    public ArrayDequeStack5() {
        this.stack5 = new ArrayDeque<>();
    }

    public void addStack5(Integer value) {
        stack5.addFirst(value);
    }

    public void printSrack5() {
        while (!stack5.isEmpty()) {
            System.out.println(stack5.pop());
        }
    }
}
