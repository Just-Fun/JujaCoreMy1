package ua.com.juja.leetcode.A_219_Contains_Duplicate_2;

import java.io.*;
import java.util.Calendar;

/**
 * Created by serzh on 3/12/16.
 */
public class Main {
    public static void main(String[] args) {

//        BufferedReader bufferedReader = null;
        String line = "Empty";

        try {
//            long begin = Calendar.getInstance().
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/serzh/Desktop/text.txt"));
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) break;
                String[] array = line.split(", ");
                System.out.println("array.length: " + array.length);
                int[] integers = new int[array.length];
                for (int j = 0; j < array.length; j++) {
                    integers[j] = Integer.parseInt(array[j]);
                }

                Solution3 solution = new Solution3();
                System.out.println("Before");
                long start = System.currentTimeMillis();
                System.out.println(solution.containsNearbyDuplicate(integers, 15000));
                long end = System.currentTimeMillis( );
                long diff = end - start;
                System.out.println("After");
                System.out.println("Time" + diff);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Не нашел файлик");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
