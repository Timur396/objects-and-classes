public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("Гарри Потер", 2010);
        AuthorBook authorBook1 = new AuthorBook("Джоан", "Роулинг");

        System.out.println("Книга 1 " + book1.getNameBook() + ".Год издания " + book1.getYear(7));
        System.out.println("Автор книги 1 " + authorBook1.getFirstName() + " " + authorBook1.getLastName());

        Book book2 = new Book("Мексиканец", 1995);
        AuthorBook authorBook2 = new AuthorBook("Джек ", "Лондон");

        System.out.println("Книга 2 " + book2.getNameBook() + ".Год издания " + book2.getYear(2));
        System.out.println("Автор книги 2 " + authorBook2.getFirstName() + " " + authorBook2.getLastName());

        book1.setYear(2013);
        System.out.println("Книга 1 " + book1.getNameBook() + ".Новый год издания" + book1.getYear(201));
    }

}