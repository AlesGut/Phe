package practice_7_dz.collection.LinkedList_dz4;

import java.util.LinkedList;

public class PersonNumberList {
    private LinkedList<Integer> numberList;
    private Integer sumList = 0;

    public PersonNumberList() {
        this.numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(1);
        numberList.add(5);
    }

    public void addPersonNumberList(Integer value) {
        numberList.add(value);
    }

    private Integer operationPersonNumberList() {
        for (Integer n : numberList) {
            sumList = sumList + n;
        }
        return sumList;
    }
    public void printOperationPersonNumberList(){
        System.out.println(operationPersonNumberList());
    }
}
