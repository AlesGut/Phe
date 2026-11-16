package practice_7_dz.collection.arrayList_dz1;

import java.util.ArrayList;

public class Numms_ArrayList_1 {
    private ArrayList<Integer> arr;

    public Numms_ArrayList_1() {
        this.arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(6);
        arr.add(5);
    }

    public void addArrList1(Integer value) {//добавление в массив
        arr.add(value);
    }

    public void printArrList1() {// метод для вывода массива
        System.out.println(arr);
    }
}
