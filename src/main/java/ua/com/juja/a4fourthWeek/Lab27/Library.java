package ua.com.juja.a4fourthWeek.Lab27;

/**
 * Created by serzh on 12/17/15.
 */
public class Library {

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        if (catalog.length == 0) return "";
        String out = "";
        for (Issue c : catalog) {
            if (c.getCountPages() > barrierCountPages) {
            out += c.toPrint();
            }
        }
        return out;
    }
}
