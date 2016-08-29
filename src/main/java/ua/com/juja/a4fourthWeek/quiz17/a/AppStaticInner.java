package ua.com.juja.a4fourthWeek.quiz17.a;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class AppStaticInner {

    private int p;

    public AppStaticInner() {
        p = 0;
        new InnerClass2();
    }

    public void doSmth() {
        p++;
    }

    public static class InnerClass2 {

        private String q;

        public InnerClass2() {
            q = "hello";
        }

        public void qweasd() {
            q += " world!";
        }

        public String get() {
            return q;// + p;
        }

    }



}
