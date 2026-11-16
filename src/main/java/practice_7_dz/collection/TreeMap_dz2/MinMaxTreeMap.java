package practice_7_dz.collection.TreeMap_dz2;

import java.util.TreeMap;

public class MinMaxTreeMap {
    private TreeMap<Integer, String> maxMin;

    public MinMaxTreeMap() {
        this.maxMin = new TreeMap<>();
        maxMin.put(987, "Карамба");
        maxMin.put(5, "Карамба");
        maxMin.put(867, "Карамба");
        maxMin.put(123, "Карамба");
        maxMin.put(14333, "Карамба");
        maxMin.put(-2, "Карамба");
    }

    public void printMaxMin() {
        System.out.println("минимальный ключ " + maxMin.firstKey());
        System.out.println("максимальный  ключ " + maxMin.lastKey());
    }

}
