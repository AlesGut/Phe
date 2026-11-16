package practice_7_dz.collection.LinkedHashSet_dz2;

import java.util.LinkedHashSet;

public class SetLineDuplicat {
    private LinkedHashSet<String> linkedLineDuplicat;

    public SetLineDuplicat() {
        this.linkedLineDuplicat = new LinkedHashSet<>();
    }

    public void addLinkedDuplicat(String value) {
        linkedLineDuplicat.add(value);
    }

    public void printLinkedDuplicat() {
        System.out.println(linkedLineDuplicat);
    }
}

