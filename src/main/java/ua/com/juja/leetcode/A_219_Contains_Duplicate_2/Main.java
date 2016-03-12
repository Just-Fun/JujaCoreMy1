package ua.com.juja.leetcode.A_219_Contains_Duplicate_2;

import java.io.*;

/**
 * Created by serzh on 3/12/16.
 */
public class Main {
    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "Empty";

        try {
            fileReader = new FileReader("/home/serzh/Desktop/text.txt");
            bufferedReader = new BufferedReader(fileReader);
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) break;
                String[] array = line.split(", ");
                int[] integers = new int[array.length];
                for (int j = 0; j < array.length; j++) {
                    integers[j] = Integer.parseInt(array[j]);
                }

                Solution solution = new Solution();
                System.out.println("Before");
                System.out.println(solution.containsNearbyDuplicate(integers, 15000));
                System.out.println("After");
//                for (int i = 0; i < array.length; i++) {
//
//                    System.out.println(integers[i]);
//                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Не нашел файлик");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
