package practice_7_dz.arrayList.LinkedList_dz5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTask5 {
    public LinkedList<String> listPassageway;

    public ListTask5() {
        this.listPassageway = new LinkedList<>();
        listPassageway.add("задача 1");
        listPassageway.add("задача 2");
        listPassageway.add("задача 3");
        listPassageway.add("задача 4");
        listPassageway.add("задача 5");
    }

    public void passagewayFirst() {
        Iterator<String> it = listPassageway.iterator();
        System.out.println("Сверху: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void passagewayLast() {
        ListIterator<String> it = listPassageway.listIterator(listPassageway.size());
        System.out.println("Снизу: ");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
 /*
         for (String n : listPassageway) {
            System.out.println(listPassageway.iterator().next());
        }

    }*/
    }
}
