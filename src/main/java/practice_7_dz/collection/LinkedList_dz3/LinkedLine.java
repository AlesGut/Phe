package practice_7_dz.collection.LinkedList_dz3;

import java.util.LinkedList;

public class LinkedLine {
    private LinkedList<String> linkedLineB;

    public LinkedLine() {
        this.linkedLineB = new LinkedList<>();
        linkedLineB.add("Чай горячий !");
        linkedLineB.add("Хата горит !");
        linkedLineB.add("Заец прыгает ");
    }

    public void printFirstLast() {
        System.out.println(linkedLineB.getFirst() + ", " + linkedLineB.getLast());

    }
}
