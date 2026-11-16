package practice_7_dz.collection.PriorityQueue;

import java.util.PriorityQueue;

public class NumberQueue {
    private PriorityQueue<Integer> queue5;

    public NumberQueue() {
        this.queue5 = new PriorityQueue<>();
    }

    public void addQueue5(Integer value) {
        queue5.add(value);
    }

    public void printQueue5() {
        while (!queue5.isEmpty()) {
            System.out.println(queue5.poll());
        }
    }
}
