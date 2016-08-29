package ua.com.juja.interviews.epam.Epam_test_8;

/**
 * Created by serzh on 4/22/16.
 */
public class Child extends Parent implements Interface {
    public String line = "c";
    int mCh;

    public Child(int i) {
        super(i);
        mCh = i;
    }

    public Child(int i, String line) {
        super(i);
        mCh = i;
        this.line = line;
    }

    public Child(String s) {
        line = s;
    }

    public String getLine() {
        return line;
    }
}
