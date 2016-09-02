package ua.com.juja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Serzh on 9/2/16.
 */
public class Temp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Fist", "Second", "Third"));
        String s = String.join("+", list);
        System.out.println(s);
    }
}
