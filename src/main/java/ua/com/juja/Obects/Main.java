package ua.com.juja.Obects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by serzh on 6/9/16.
 */
public class Main {


    public static void main(String[] args) {
        int a [][] = new int[5][];
        for(int i = 0; i < a.length-1; i++) {

            a[i] = new int[i+1];
        }

        for(int i = 0; i < a.length; i++) {

            System.out.println(Arrays.toString(a[i]));
        }
    }

}
