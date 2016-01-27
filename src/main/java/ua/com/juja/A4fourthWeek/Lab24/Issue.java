package ua.com.juja.A4fourthWeek.Lab24;

/**
 * Created by serzh on 12/17/15.
 */
public class Issue {

    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }

}
