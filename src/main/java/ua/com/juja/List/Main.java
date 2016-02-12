package ua.com.juja.List;

/**
 * Created by serzh on 2/8/16.
 */
public class Main {

    public static void main(String[] args) {
        int[][] array = new int[1][3];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println("");
        }
    }
}
