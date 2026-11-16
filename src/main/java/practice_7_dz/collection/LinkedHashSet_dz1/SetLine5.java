package practice_7_dz.collection.LinkedHashSet_dz1;

import java.util.LinkedHashSet;

public class SetLine5 {
    private LinkedHashSet<String> linkedLine;

    public SetLine5() {
        this.linkedLine = new LinkedHashSet<>();
    }

    public void addLinkedLine(String value) {
        linkedLine.add(value);
    }

    public void printLinkedLine() {
        System.out.println(linkedLine);
    }
}
