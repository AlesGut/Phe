package practice_7_dz.collection.HashMap_dz1;

import java.util.HashMap;

public class MapTask1 {
    private HashMap<String, Integer> nameAge;

    public MapTask1() {
        this.nameAge = new HashMap<>();
        nameAge.put("Колян", 28);
        nameAge.put("Артур", 15);
        nameAge.put("Анастасия", 89);
        nameAge.put("Константин", 55);
        nameAge.put("Рада", 42);
    }

    public void printMapNameAge() {
        System.out.println(nameAge);
    }
}
