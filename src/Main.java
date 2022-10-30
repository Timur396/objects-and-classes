public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("Гарри Потер", 2010, new AuthorBook("Джоан", "Роулинг"));
        System.out.println("Книга 1 " + book1.getNameBook() + ".Год издания " + book1.getYear(7));

        Book book2 = new Book("Мексиканец", 1995, new AuthorBook("Джек ", "Лондон"));
        System.out.println("Книга 2 " + book2.getNameBook() + ".Год издания " + book2.getYear(2));

        book1.setYear(2013);
        System.out.println("Книга 1 " + book1.getNameBook() + ".Новый год издания" + book1.getYear(201));
    }

}