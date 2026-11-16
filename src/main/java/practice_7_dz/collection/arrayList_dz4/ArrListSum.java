package practice_7_dz.collection.arrayList_dz4;

import java.util.ArrayList;

public class ArrListSum {
    private ArrayList<Integer> arraySum;

    public ArrListSum() {
        this.arraySum = new ArrayList<>();
        arraySum.add(34);
        arraySum.add(66);
        arraySum.add(76);
        arraySum.add(24);
    }

    public Integer operatorSum() {  //Метод для вычисления суммы
        Integer sum = 0;
        for (Integer n : arraySum) {
            sum = sum + n;
        }

        return sum;
    }

    public void printOperatorSum() {// метод для вывода результата вычислений
        System.out.println(operatorSum());
    }

    public void addArrListSum(Integer value) { // метод для добавления элемента
        arraySum.add(value);
    }

}
