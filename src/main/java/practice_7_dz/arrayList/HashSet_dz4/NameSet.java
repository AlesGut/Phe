package practice_7_dz.arrayList.HashSet_dz4;

import java.util.HashSet;

public class NameSet {
    private HashSet<String> nameSet;

    public NameSet() {
        this.nameSet = new HashSet<>();
        nameSet.add("Николай");
        nameSet.add("Виктор");
        nameSet.add("Абдул");
        nameSet.add("Александр");
        nameSet.add("Фридрих");
    }

    public void searchSet(String name) {
        if (nameSet.contains(name)) {
            System.out.println("Есть такое имя");
        }else
        {
            System.out.println("Нет такого имени");
        }

    }
}

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameSet other = (NameSet) o;
        return nameSet.equals(other.nameSet);
    }
    @Override
    public int hashCode() {
        return nameSet.hashCode();
    }*/
