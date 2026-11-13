package practice_7_dz.arrayList.HashSet_dz3;

import java.util.HashSet;
import java.util.List;

public class ListToSet {
    private HashSet<String> toSet;

    public ListToSet() {
        //   this.toSet = new HashSet<>();
    }

    public void convert(List<String> list) {
        toSet = new HashSet<>(list);
    }

    public void printToSet() {
        System.out.println(toSet);
    }
}
