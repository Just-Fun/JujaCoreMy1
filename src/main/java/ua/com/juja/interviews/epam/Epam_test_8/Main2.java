package ua.com.juja.interviews.epam.Epam_test_8;

/**
 * Created by serzh on 4/22/16.
 */
public class Main2 {
    public static void main(String[] args) {

        Parent parent = new Child(2);
        System.out.println(parent.num);
        Interface child = new Child(4);
        System.out.println(child.getLine());
        Child child1 = new Child(4);
        System.out.println(child1.mCh);
        System.out.println(child1.getLine());










    }
}
