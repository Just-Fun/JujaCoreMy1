package ua.com.juja.interviews.epam.Epam_test_3;

/**
 * Created by serzh on 4/1/16.
 */
public class Abc { // p3.1 /n p1
    public static void main(String[] args) {
        p1:
        {
            p2:
            {
                p3:
                {
                    System.out.println("p3.1");
                    if (true) break p2;
                    System.out.println("p3.2");
                }
                System.out.println("p2");
            }
            System.out.println("p1");
        }
    }
}
