package practice_7_dz.collection.LinkedHashMap_dz2;

import java.util.LinkedHashMap;

public class AddSoutContact {
    private LinkedHashMap<String, String> phoneBook;

    public AddSoutContact() {
        this.phoneBook = new LinkedHashMap<>();
        phoneBook.put("Мирана", "8-(999)999 99 99");
        phoneBook.put("Альбина", "8-(933)999 99 99");
        phoneBook.put("Фара", "8-(455)999 99 99");
    }

    public void getContact(String name) {
        System.out.println(name + " " + phoneBook.get(name));
    }

    public void addContact(String name, String number) {
        phoneBook.put(name, number);
    }
}
