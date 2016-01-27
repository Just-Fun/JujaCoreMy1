package ua.com.juja.A4fourthWeek.Lab26;

/**
 * Created by serzh on 12/17/15.
 */
public class Library {
    public String printCatalog(Issue[] catalog) {
        if (catalog.length == 0) return "";
        String out = "";
        for (Issue c : catalog) {
            out += c.toPrint();
        }
            return out;
    }

    public static void main(String[] args) {
        Issue issue1 = new Issue("Издание 1", 5);
        Issue issue2 = new Issue("Издание 2", 6);
        Issue[] issues = new Issue[2];
        issues[0] = issue1;
        issues[1] = issue2;
        Issue[] issuesEmpty = new Issue[0];

        Library library = new Library();
        String s = library.printCatalog(issues);
        String s0 = library.printCatalog(issuesEmpty);
        System.out.println(s);
        System.out.println(s0);
        System.out.println(issue1.getClass());
    }
}
