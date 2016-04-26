package ua.com.juja.Interviews.Epam.Epam_test_9;

import ua.com.juja.Interviews.Epam.Epam_test_4.C;

/**
 * Created by serzh on 4/25/16.
 */
public class A {
    int i = 1;

    private String runNow() {
        return "High";
    }

    public static void main(String[] args) {
//        A[] a = new B[]{new B(), new C()}; // new C() - не комплится
        // non-static variable this cannot be referenced from a static context
        // сделаем C static:
        D d = new D();
        A[] a = new B[]{new B(), new C(), new D()};
        for (A aa : a) {
            System.out.print(aa.runNow() + " "); // High 1 High 1 High 1,
            //Существуют методы, которые подкласс не может переопределять.
            // Например, в Java метод, объявленный с ключевым словом final, не может быть переопределён.
            // Методы, объявленные как private или static не могут быть переопределены,
            // поскольку это соответствует неявному использованию final. Также это невозможно для класса,
            // объявленного как final, стать суперклассом[3].
            System.out.print(aa.i + " "); //но если поменять private на public, то: Low 1 Out 1 D... 1
        }
        System.out.println("");
        A a1 = new A();
        System.out.println(a1.runNow());
        A a2 = new B();
        System.out.println(a2.runNow());
        A a3 = new D();
        System.out.println(a3.runNow());


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
