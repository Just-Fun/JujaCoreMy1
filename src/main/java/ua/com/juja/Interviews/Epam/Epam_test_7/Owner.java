package ua.com.juja.Interviews.Epam.Epam_test_7;

/**
 * Created by serzh on 4/22/16.
 */
//№10
public class Owner {
    class Inner {

    }

    public static void main(String[] args) {
//        new Owner.Inner();
//        Owner.new Inner();
//        new Owner.new Inner();
        new Owner().new Inner(); //единственное правильное
//        Owner.Inner();
//        Owner().Inner();

    }
}
