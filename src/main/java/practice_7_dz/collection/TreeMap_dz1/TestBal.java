package practice_7_dz.collection.TreeMap_dz1;

import java.util.Map;
import java.util.TreeMap;

public class TestBal {
    private TreeMap<String, Integer> nameBal;

    public TestBal() {
        this.nameBal = new TreeMap<>();
        nameBal.put("Никита", 56);
        nameBal.put("Алиса", 66);
        nameBal.put("Алексай", 76);
        nameBal.put("Филимон", 86);
        nameBal.put("Виктор", 96);
    }

    public void printTestBal() {
        for (Map.Entry<String, Integer> entry : nameBal.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
