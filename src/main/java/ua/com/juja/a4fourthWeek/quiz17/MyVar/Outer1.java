package ua.com.juja.a4fourthWeek.quiz17.MyVar;

/**
 * Created by serzh on 12/30/15.
 */
public class Outer1 {
    int k = 9;
    class Inner1 {
        int k1 = k;
        class Inner2{
            void t() {

            int k2 = k;
            }
        }
    }
}
