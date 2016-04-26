package ua.com.juja.Interviews.Epam.Epam_test_10;

/**
 * Created by serzh on 4/26/16.
 */
//#2
public class Test1 implements Cloneable {
    public static void main(String[] args) throws Exception {
        Test1 test = new Test1();
        Test1 tC = (Test1) test.clone(); // CloneNotSupportedException,
        // наверное class does not support the {@code Cloneable} interface
        // заимплементим Cloneable

        Test1 test2 = test;
        boolean r = test.toString().equals(test2.toString()); //true, test2 - ссылка н тот же объект
        boolean rC = tC.toString().equals(test.toString()); // false, tC - клон, новый обект
        System.out.println(r);
        System.out.println(rC);
    }
}
