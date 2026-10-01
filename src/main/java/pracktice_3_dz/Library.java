package pracktice_3_dz;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    int getYear() {   //геттер поля year
        return year;
    }

    String getAuthor() { //геттер поля author
        return author;
    }

    String getBookTitle() { //геттер поля bookTitle
        return bookTitle;
    }

    void setAuthor(String newAuthor) {  //сеттер поля author
        this.author = newAuthor;
    }

    void setBookTitle(String newBookTitle) { //сеттер поля bookTitle
        this.bookTitle = newBookTitle;
    }

    void setYear(int newYear) { //сеттер поля year
        this.year = newYear;
    }
}



