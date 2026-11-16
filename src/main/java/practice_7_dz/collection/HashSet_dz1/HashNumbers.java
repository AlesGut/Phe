package practice_7_dz.collection.HashSet_dz1;

import java.util.HashSet;

public class HashNumbers {
    private HashSet<Integer> hashNam5;

    public HashNumbers() {
        this.hashNam5 = new HashSet<>();
        hashNam5.add(1);
        hashNam5.add(4);
        hashNam5.add(23);
        hashNam5.add(4123);
        hashNam5.add(443);
    }
    public void printHashNam5(){
        System.out.println(hashNam5);
    }

}
