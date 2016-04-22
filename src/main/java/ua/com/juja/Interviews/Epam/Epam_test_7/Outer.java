package ua.com.juja.Interviews.Epam.Epam_test_7;

/**
 * Created by serzh on 4/22/16.
 */
public class Outer {
    int outer_x = 100;
    void test() {
        for (int i = 0; i < 5; i++) {
            class Inner {
                void displey() {
                    System.out.println("outer_x = " + outer_x + "; ");
                }
            }
            Inner inner = new Inner();
            inner.displey();
        }

    }
}
