public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("Гарри Потер", 2010, new AuthorBook("Джоан", "Роулинг"));
        System.out.println(book1);

        Book book2 = new Book("Мексиканец", 1995, new AuthorBook("Джек ", "Лондон"));
        System.out.println(book2);

        book1.setYear(2013);
        System.out.println(book1);
    }

}