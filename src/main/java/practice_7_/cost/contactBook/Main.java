package practice_7_.cost.contactBook;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Никита", 1233);
        contactBook.addContact("Коля", 2344);
        contactBook.printContacts();
    }
}
