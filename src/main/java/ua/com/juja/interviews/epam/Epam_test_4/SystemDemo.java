package ua.com.juja.interviews.epam.Epam_test_4;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by serzh on 4/15/16.
 */
public class SystemDemo {
    public static void main(String[] args) throws Exception {

        // create file
        FileOutputStream f = new FileOutputStream("/home/serzh/Desktop/text1.txt");
        PrintStream out = new PrintStream(f);

        PrintStream console = System.out;

        System.setOut(console);
        System.out.println("Cons");
        System.setOut(out);
        System.out.println("Out");

        // this text will get redirected to file
        System.out.println("This is System class!!!");
        out.close();
//        console.close();
        System.out.println("3");
    }
}
