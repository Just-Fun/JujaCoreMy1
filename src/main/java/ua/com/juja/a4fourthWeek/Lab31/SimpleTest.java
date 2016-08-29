package ua.com.juja.a4fourthWeek.Lab31;

/**
 * Created by serzh on 12/17/15.
 */
public class SimpleTest {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "A";
        strings[1] = "B";
        strings[2] = "C";
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();

        strings[0] = strings[1];
        strings[1] = strings[2];
        strings[2] = null;

        for (String s : strings) {
            System.out.println(s);
        }

        strings[strings.length - 1] = "S -1";
        System.out.println();

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
