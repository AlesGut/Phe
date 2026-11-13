package practice_7_dz.arrayList.TreeSet_dz2;

import java.util.TreeSet;

public class TreeSetNoDuplicat {
    private TreeSet<Integer> treeSetDuplicat;

    public TreeSetNoDuplicat() {
        this.treeSetDuplicat = new TreeSet<>();
    }

    public void addTreeSetDuplicat(Integer value) {
        treeSetDuplicat.add(value);
    }

    public void printtreeSetDuplicat() {
        System.out.println(treeSetDuplicat);
    }
}

