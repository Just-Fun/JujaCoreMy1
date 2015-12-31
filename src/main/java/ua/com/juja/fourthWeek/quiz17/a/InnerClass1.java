package ua.com.juja.fourthWeek.quiz17.a;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class InnerClass1 {

    private String q;

    public InnerClass1() {
        q = "hello";
    }

    public void qweasd() {
        q += " world!";
    }

    public void t() {
        class TR {
            String s = q;
        }
    }

}
