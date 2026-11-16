package practice_7_dz.collection.ArrayDeque_dz3;

import java.util.ArrayDeque;

public class ArrayDequeLastFirst {
    private ArrayDeque<String> deQueue;

    public ArrayDequeLastFirst() {
        this.deQueue = new ArrayDeque<>();
    }

    public void addFirstDeQueue(String value) {
        deQueue.addFirst(value);

    }

    public void addLastDeQueue(String value) {
        deQueue.addLast(value);
    }

    public void printLastDeQueue() {
        System.out.println("Извлечен с конца " + deQueue.removeLast());
    }

    public void printFirstDeQueue() {
        System.out.println("Извлечен с начала " + deQueue.removeFirst());
    }
    public void printAllFirstDeQueue(){
        while (!deQueue.isEmpty()){
            System.out.println(deQueue.poll());
        }
    }
}
