package practice_7_dz.collection.HashMap_dz3;

import java.util.HashMap;
import java.util.Map;

public class HashMapAge18 {
    private HashMap<String, Integer> human;

    public HashMapAge18() {
        this.human = new HashMap<>();
    }

    public void addHuman(String name, Integer age) {
        human.put(name, age);
    }

    public void PrintYoung() {
        for (Map.Entry<String, Integer> entry : human.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
