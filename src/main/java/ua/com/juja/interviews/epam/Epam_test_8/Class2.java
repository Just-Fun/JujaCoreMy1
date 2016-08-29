package ua.com.juja.interviews.epam.Epam_test_8;

/**
 * Created by serzh on 4/22/16.
 */
public class Class2 extends Class1 {
    Class2(double d ) {
        this((int) d);
        System.out.println("Class2(double)");
    }

    /*public Class2(int i) { // хочет или добавит super(i) или создать пустой конструктор в Class1
        System.out.println("Class2(int)");
    }*/

    public Class2(int i) {
        super(i);
    }
}
