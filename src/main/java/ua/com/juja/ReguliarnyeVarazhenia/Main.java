package ua.com.juja.ReguliarnyeVarazhenia;

/**
 * Created by serzh on 2/11/16.
 */
public class Main {
    public static void main(String[] args) {

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        int i = validationString.indexOf('d');
        System.out.println(i);
    }
}
