package ua.com.juja.A4fourthWeek.quiz17.a;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class AppInner {

    private int p;

    public AppInner() {
        p = 0;
    }

    public void doSmth() {
        p++;
    }

    public class InnerClass3 {

        private String q;

        public InnerClass3() {
            q = "hello";
        }

        public void qweasd() {
            q += " world!";
        }

        public String get() {
            return q + p;
        }

    }



}
