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

    void setAuthor(String someAuthor) {  //сеттер поля author
        this.author = someAuthor;
    }

    void setBookTitle(String someBookTitle) { //сеттер поля bookTitle
        this.bookTitle = someBookTitle;
    }

    void setYear(int someYear) { //сеттер поля year
        this.year = someYear;
    }
}



