package practice_7_dz.collection.HashMap_dz2;

import java.util.HashMap;

public class HashMapSearsh {
    private HashMap<String, Integer> nameAgeMap;

    public HashMapSearsh() {
        this.nameAgeMap = new HashMap<>();
        nameAgeMap.put("Колян", 28);
        nameAgeMap.put("Артур", 15);
        nameAgeMap.put("Анастасия", 89);
        nameAgeMap.put("Константин", 55);
        nameAgeMap.put("Рада", 42);
    }

    public void searshMapNameAge(String name) {
        if (nameAgeMap.get(name) == null) {
            System.out.println("Нет такого имени");
        } else {
            System.out.println("Есть такой человек, ему " + nameAgeMap.get(name) + " лет");

        }
    }
}
