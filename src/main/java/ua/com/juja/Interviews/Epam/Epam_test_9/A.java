package ua.com.juja.Interviews.Epam.Epam_test_9;

import ua.com.juja.Interviews.Epam.Epam_test_4.C;

/**
 * Created by serzh on 4/25/16.
 */
public class A {
    int i = 1;

    public static void main(String[] args) {
//        A[] a = new B[]{new B(), new C()}; // new C() - не комплится
        // non-static variable this cannot be referenced from a static context
        // сделаем C static:
        D d = new D();
        A[] a = new B[]{new B(), new C(), new D()};
        for (A aa : a) {
            System.out.print(aa.runNow() + " "); // High 1 High 1
            System.out.print(aa.i + " ");
        }
    }

    private String runNow() {
        return "High";
    }

    static class B extends A {
        int i = 2;

        public String runNow() {
            return "Low";
        }
    }

    /*class C extends A.B {
        public String runNow() {
            return "Out";
        }
    }*/

    static class C extends A.B {
        int i = 3;

        public String runNow() {
            return "Out";
        }
    }

}
