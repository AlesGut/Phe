package pracktice_3_dz;

public class Book {
    String title;
    String author;

    Book(String someTitle, String someAuthor) {
        title = someTitle;
        author = someAuthor;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void printInfo() {
        System.out.println("Автор " + getAuthor() + " Книга " + getTitle());
    }
}
