package ua.com.juja.fourthWeek.Lab24;

/**
 * Created by serzh on 12/17/15.
 */
public class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages) {
        super(name, countPages);
    }
    public Book(String name, int countPages, String author) {
        super(name, countPages);
        authorBook = author;
    }

    public String toPrint() {
        return "Book{" + super.toPrint() + ",author=" + authorBook + "}";
    }
}