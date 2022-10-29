public class Book {

    private final String nameBook;
    private int year;

    public Book(String nameBook, int year) {
        this.nameBook = nameBook;
        this.year = year;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear(int i) {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

