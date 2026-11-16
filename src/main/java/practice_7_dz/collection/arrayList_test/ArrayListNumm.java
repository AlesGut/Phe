package practice_7_dz.collection.arrayList_test;

public class ArrayListNumm {
    private java.util.ArrayList<Integer> arr;

    public ArrayListNumm() {
        this.arr = new java.util.ArrayList<>();
        add(4);
        add(6);
    }

    public void add(Integer value) {
        arr.add(value);
    }

    public void print() {
        Integer target = 0;
        for (Integer n : arr) {
            target = target + n;
        }


       /* String target = "1";
        for (String n: arr){

            if (n.length() > target.length()){
                target=n;
            }
        }*/


        /*  for (Integer n : arr) {
            if (n % 2==0){
                System.out.println(n);
            }
        }*/
        System.out.println(target);
    }
}
