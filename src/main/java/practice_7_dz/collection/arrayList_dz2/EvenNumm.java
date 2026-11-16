package practice_7_dz.collection.arrayList_dz2;

import java.util.ArrayList;

public class EvenNumm {
    private ArrayList<Integer> arrEven;

    public EvenNumm() {
        this.arrEven = new ArrayList<>();
    }

    public void addEvenNumm(Integer value) { // метод для добавления в массив
        arrEven.add(value);
    }

    public void printEvenNumm() { // метод для вывода

        for (Integer n : arrEven) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        System.out.println(arrEven);
    }
}
