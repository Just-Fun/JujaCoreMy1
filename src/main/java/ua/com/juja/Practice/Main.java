package ua.com.juja.Practice;

import ua.com.juja.OOP.Example.Cello;

/**
 * Created by serzh on 17.07.16.
 */
public class Main {

    public static void main(String[] args) {

        Cello cello = new Cello();
        cello.getString()[0] = "F";
        System.out.println(cello.getString()[0]);

    }

    private static int sumLambda(int... num) {
        int result = 0;
        return result;
    }

    private static int sum(int... num) {
        int result = 0;
        for (int i : num) {
            result += i;
        }
        return result;
    }


}
