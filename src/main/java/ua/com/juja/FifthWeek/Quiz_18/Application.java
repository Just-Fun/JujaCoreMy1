package ua.com.juja.FifthWeek.Quiz_18;

/**
 * Created by serzh on 12/23/15.
 */
public class Application {

        public static void main(String[] args) {
            Object[] ref = new Object[1];
            while (true) {
                ref[0] = new Object[]{ref};
                ref = (Object[]) ref[0];
            }
        }
}
