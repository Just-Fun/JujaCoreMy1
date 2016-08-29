package ua.com.juja.interviews.epam.Epam_test_5;

/**
 * Created by serzh on 4/18/16.
 */
//#6
public class Test {
    private Integer k;
    private int z;
    private int i;
    public void method() {
        i = k + z;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.method(); //NullPointerException
        System.out.println(t.i);
    }
}
