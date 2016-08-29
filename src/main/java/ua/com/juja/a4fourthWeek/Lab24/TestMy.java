package ua.com.juja.a4fourthWeek.Lab24;

/**
 * Created by serzh on 12/17/15.
 */
public class TestMy {
    public static void main(String[] args) {
        Issue issue = new Issue("P s", 108);
        Book book = new Book("Public smth", 108, "Vasia");
        System.out.println(issue.toPrint());
        System.out.println(book.toPrint());

    }
}
