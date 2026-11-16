package practice_7_dz.collection.HashSet_dz2;

import java.util.HashSet;

public class HashSetNum10 {
    private HashSet<Integer> setNum10;

    public HashSetNum10() {
        this.setNum10 = new HashSet<>();
        setNum10.add(98);
        setNum10.add(78);
        setNum10.add(56);
        setNum10.add(28);
        setNum10.add(26);
        setNum10.add(25);
        setNum10.add(21);
        setNum10.add(22);
    }

    public void addSetNum10(Integer value) {
        setNum10.add(value);
    }

    public void searchNum(Integer a) {
        System.out.println(setNum10.contains(a));
    }

    public void printSetNum10() {
        System.out.println(setNum10);
    }
}

