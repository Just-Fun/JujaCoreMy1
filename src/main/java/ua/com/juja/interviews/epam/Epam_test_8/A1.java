package ua.com.juja.interviews.epam.Epam_test_8;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by serzh on 4/25/16.
 */
public class A1 {
    public void method() throws IOException {
        System.out.println("r");
    }
}
class B1 extends A1{
    public void method() throws FileNotFoundException {
    }
}
