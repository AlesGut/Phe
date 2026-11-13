package practice_7_dz.arrayList.arrayList_dz5;

import java.util.ArrayList;

public class ArrayListMax {
    private ArrayList<Integer> arrayListMax;

    public ArrayListMax() {
        this.arrayListMax = new ArrayList<>();
        arrayListMax.add(4);
        arrayListMax.add(23);
        arrayListMax.add(145);
    }

    Integer max = -2147483648;

    public void addArrayListMax(Integer value) { // метод для добавления чисел
        arrayListMax.add(value);
    }

    private Integer operatorMax() {  // вычисление максимального значения

        for (Integer n : arrayListMax) {
            if (n > max) {
                max = n;
            }

        }
        return max;
    }

    public void printValueMax() {    // метод для вывода результатов вычисления
        System.out.println(operatorMax());
    }
}




   /* private Integer operatorMax() {                       //ОНО ЖИВОЕ НО СТРАННОЕ
        //Integer n;
        for (Integer n : arrayListMax) {
            for (Integer a : arrayListMax) {
                if (n < a) {
                    if (a > max) {
                        max = a;
                    }
                    break;
                } else if (n > a) {
                    if (n > max) {
                        max = n;
                    }
                    break;

                }
            }

        }
        return max;
    }*/



