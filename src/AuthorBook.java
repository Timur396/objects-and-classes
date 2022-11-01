import java.util.Objects;
public class AuthorBook {


    private final String firstName;
    private final String lastName;

    public AuthorBook(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (this == null || this.getClass() != other.getClass())
            return false;
        AuthorBook authorBook = (AuthorBook) other;
        return authorBook.equals(firstName) && authorBook.equals(lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstName,lastName);
    }



}
