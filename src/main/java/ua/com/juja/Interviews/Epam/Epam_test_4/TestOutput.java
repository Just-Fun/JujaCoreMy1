package ua.com.juja.Interviews.Epam.Epam_test_4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by serzh on 4/15/16.
 */
public class TestOutput {
    public static void main(String[] args) throws IOException {

        //#1 в консоль FIRST OUTPU, в файл SECOND OUTPUT
       /* PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("/home/serzh/Desktop/text1.txt")));
        PrintStream console = System.out;
        System.setOut(console);
        System.out.println("FIRST OUTPUT");
        System.setOut(out);
        System.out.println("SECOND OUTPUT");
        out.close();
        System.out.println("THIRD OUTPUT");*/

        // №2
        /*byte b = 257; // не компилится -> byte <= 127...
        int i = 10; // ok
        boolean b = null; // не компилится
        float f = 1.3; // не компилится, хочет суффикс f или F в конце
        char c = "a"; // хочет не "", а ''...*/

        //#3// 1234567ABac/n 3456
       /* byte[] a = {49, 50, 51, 52, 53, 54, 55, 65, 66, 97, 99};
        String b = new String(a);
        System.out.println(b);

        String c = new String(a, 2, 4);
        System.out.println(c);*/

        //#4 //
       /* int i1 = Integer.MAX_VALUE; // 2147483647
        int i2 = Integer.MAX_VALUE + 1; //-2147483648
        int i = Integer.MAX_VALUE + 10; //-2147483639
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i);*/

        //#5
        /*Integer i = 5000;
        System.out.println(i.hashCode()); // 5000*/

        //#6
   /*     Boolean f1 = true;
        Boolean f2 = new Boolean("/false");
        String a = "" + 1 + "+" + 1 + '=' + (1 + 1) + " is ";
        String b = a + f1 + "/" + f2;

        System.out.println(b); //1+1=2 is true/false*/

        //#8
     /*   int f;
        f = 5;
        f = ++f + f++; // последние ++ не учитываются
        System.out.println(f); // 12*/

        //#9
      /*  Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2); // true
        System.out.println(new ArrayList<String>().getClass()); // class java.util.ArrayList
        System.out.println(new ArrayList<Integer>().getClass()); // class java.util.ArrayList
        System.out.println(c1.hashCode()); // 2125039532
        System.out.println(c2.hashCode()); // 2125039532*/



    }
/*
    public static void main(String[] args) throws IOException {


    }*/








}
