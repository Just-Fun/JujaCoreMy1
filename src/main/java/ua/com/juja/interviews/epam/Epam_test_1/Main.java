package ua.com.juja.interviews.epam.Epam_test_1;

import java.io.*;

/**
 * Created by serzh on 3/30/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //#1
/*
     System.out.println( 0.3 == 0.1d + 0.1d + 0.1d );// false, так как 0.1d + 0.1d + 0.1d = 0.30000000000000004
*/
        //#2
/*        byte b = 0;
        while (++b > 0);
        System.out.println(b); // -128*/

        //5
       /* label1:
        for (int i = 0; i < 3; i++) {
            if (i == 1) continue label1; // аналогично if (i == 1) continue;
            label2:
            System.out.print("TEST ");
            label3:
            ;
        } // TEST TEST  */

        // #6 // Программа выведет на экран содержимое файла
        /*try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/serzh/Desktop/text.txt")));
            String str;
            try {
                do {
                    str = br.readLine();
                    System.out.println(str);
                } while (str != null);
            } finally {
                br.close();
            }
        } catch (IOException e)

        {
            e.printStackTrace();
        }
*/

        //#7
       /* Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2); // false
        System.out.println(i1 == 1000); // true*/

        // #8
        /*long l = 100;
        String s = new String(); // 1. s = "" + l, 2.s = Long.toString(l);
        System.out.println(s);*/

        //#10
        /*int[][] arr = {{1, 2, 3}, {0, 0, 0}, {3, 2, 1}};
        for (int i[] : arr) {
            for (int j: i) {
                System.out.print(j+" ");
            }
        }
*/
    }


//#3
/*public class SynchDirectories {
    public static void main(String[] args) {
        impl test = new impl();
        I_A a;
        a = test;
        a.out1();
        ((I_B) a).out2();
    } // напечатет 12
}

interface I_A {
    public void out1();
}

interface I_B {
    public void out2();
}

class impl implements I_A, I_B {
    public void out1() {
        System.out.print("1");
    }

    public void out2() {
        System.out.print("2");
    }
}*/
//#4
    /*class A {
        A(int i) {
        }
    }

    class B extends A { //ошибка во время компиляции в строке (требует конструктор, mathing super)

    }*/

//#


}

