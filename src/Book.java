public class Book {

    private final String nameBook;
    private final AuthorBook authorBook;
    private int year;

    public Book(String nameBook, int year, AuthorBook authorBook) {
        this.nameBook = nameBook;
        this.year = year;
        this.authorBook = authorBook;


    }

    public String getNameBook() {
        return this.nameBook;

    }

    public AuthorBook getAuthorBook() {
        return this.authorBook;
    }

    public int getYear(int i) {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;


    }
}

