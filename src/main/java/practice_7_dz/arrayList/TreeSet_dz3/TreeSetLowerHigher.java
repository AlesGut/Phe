package practice_7_dz.arrayList.TreeSet_dz3;

import java.util.TreeSet;

public class TreeSetLowerHigher {
    private TreeSet<Integer> lowerHigher;

    public TreeSetLowerHigher() {
        this.lowerHigher = new TreeSet<>();
        lowerHigher.add(1);
        lowerHigher.add(2);
        lowerHigher.add(3);
        lowerHigher.add(4);
        lowerHigher.add(5);
        lowerHigher.add(6);
        lowerHigher.add(7);
        lowerHigher.add(8);
    }

    public void addLowerHigher(Integer value) {
        lowerHigher.add(value);
    }

    public void lowerSet(Integer low) {
        System.out.println("Ближний наименьший: " + lowerHigher.lower(low));
    }

    public void higherSet(Integer hig) {
        System.out.println("Ближний наибольший: " + lowerHigher.higher(hig));
    }
}
