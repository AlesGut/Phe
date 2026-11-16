package practice_7_dz.collection.arrayList_dz3;

import java.util.ArrayList;

public class LongLine {
    private ArrayList<String> arrayLong;
    String a = "1";

    public LongLine() {
        this.arrayLong = new ArrayList<>();
        arrayLong.add("Курица летит");
        arrayLong.add("Корова");
        arrayLong.add("Лис");
        arrayLong.add("Конструктор");
        arrayLong.add("Конюх");
    }

    public String operation() {
        for (String n : arrayLong) {
            if (a.length() < n.length()) {
                a = n;
            }
        }
        return a;
    }

    public void printLongLine() {//Метод для вывода результата вычислений
        System.out.println(operation());

    }

    public void addArrayLong(String value) {
        arrayLong.add(value);  //метод для добавления в массив
    }
}
