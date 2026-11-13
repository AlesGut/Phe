package practice_7_.cost.contactBook;

import java.util.HashMap;

public class ContactBook {
    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    // добавить контакт
    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);

    }

    // поиск контакта по имени
    public Integer getPhone(String name) {
        return contacts.get(name);
    }

    //обновить телефон по имени
    public void updatePhone(String name, Integer updatePhone) {
        contacts.put(name, updatePhone);
    }

    public void printContacts() {
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("имя " + name + "телефон " + phone);
                }
        );
        System.out.println();
    }

}
