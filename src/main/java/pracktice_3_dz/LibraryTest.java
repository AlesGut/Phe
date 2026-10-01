package pracktice_3_dz;

public class LibraryTest {

    public static void main(String[] args) {
        Library test = new Library();

        System.out.println(test.getAuthor());
        test.setAuthor("Измененный Author");
        System.out.println(test.getAuthor());
        System.out.println(test.getBookTitle());
        test.setBookTitle("Измененный BookTitle");
        System.out.println(test.getBookTitle());
        System.out.println(test.getYear());
        test.setYear(15);
        System.out.println(test.getYear());
        //test.category;

    }
}
