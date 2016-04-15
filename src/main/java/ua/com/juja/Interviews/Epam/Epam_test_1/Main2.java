package ua.com.juja.Interviews.Epam.Epam_test_1;


/**
 * Created by serzh on 4/15/16.
 */
public class Main2 {
    public static void main(String[] args) {

        byte b = 0;
        while (++b > 0);
        System.out.println(b);// -128
        b += 1;
        System.out.println(b);// -127
        b += 127;
        System.out.println(b); //0
        b += 1;
        System.out.println(b); //1
        b += 126;
        System.out.println(b);// 127
        b += 1;
        System.out.println(b);// -128
    }
}
