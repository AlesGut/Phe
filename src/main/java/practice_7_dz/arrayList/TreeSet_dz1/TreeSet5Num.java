package practice_7_dz.arrayList.TreeSet_dz1;

import java.util.TreeSet;

public class TreeSet5Num {
    private TreeSet<Integer> treeSet5;

    public TreeSet5Num() {
        this.treeSet5 = new TreeSet<>();
    }

    public void addTreeSet5(Integer value) {
        treeSet5.add(value);
    }

    public void printtreeSet5() {
        System.out.println(treeSet5);
    }
}
