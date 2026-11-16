package practice_7_dz.collection.HashSet_dz3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListToSet listToSet = new ListToSet();
        List<String> listSet = List.of("a", "d", "w", "e", "a", "a", "z");
        listToSet.convert(listSet);
        listToSet.printToSet();

    }
}
