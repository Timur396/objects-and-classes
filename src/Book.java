
import java.util.Objects;
public class Book {

    private final String nameBook;
    private final AuthorBook authorBook;
    private int year;

    public Book(String nameBook, int year, AuthorBook authorBook) {
        this.nameBook = nameBook;
        this.year = year;
        this.authorBook = authorBook;
    }

    public String toString() {
        return "Название книги:" + nameBook + ".Автор книги: " + authorBook.toString() + ".Год издания: " + year;
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (this == null || this.getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return year == book.year && nameBook.equals(nameBook) && authorBook.equals(authorBook);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, authorBook.toString());
    }

    public void setYear(int year) {
        this.year = year;


    }
}

