package practice_7_dz.collection.LinkedHashMap_dz1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap5Num {
    private LinkedHashMap<String, Integer> fiveMap;

    public LinkedHashMap5Num() {
        this.fiveMap = new LinkedHashMap<>();
        fiveMap.put("Колян", 1);
        fiveMap.put("Тагир", 2);
        fiveMap.put("Анастасия", 3);
        fiveMap.put("Мыкола", 4);
        fiveMap.put("Коля", 5);
    }

    public void printFiveMap() {
        for (Map.Entry<String, Integer> entry : fiveMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
