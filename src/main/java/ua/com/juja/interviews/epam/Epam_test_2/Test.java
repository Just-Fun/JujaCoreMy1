package ua.com.juja.interviews.epam.Epam_test_2;

/**
 * Created by serzh on 3/31/16.
 */
public class Test {
    //#1
   /* static int b = Test.a; // b = 3;
    static final int a = 3;*/

    //№10
/*    public static void main(String[] args) {
        int[] x = new int[25];
        boolean b;
//        b = x[25] == 0; //ArrayIndexOutOfBoundsException
//        b = x[0] == null; // x[0] = 0; а не null
        b = x.length == 25; // true
        b = x[24] == 0; // true
        System.out.println(b);
    }*/

    //№9
    /*public abstract class One {
        public abstract int doJob();
    }
    class Two extends One{} // должен быть или абстрактным или имплементить abstract int doJob()
*/
    //#8
    /*public static void main() {  // выводит "С"
        System.out.println("A");
    }
    public static void main(String[] args) {
        System.out.println("C");

    }
    public static void main(String args) {
        System.out.println("B");

    }*/

    //#7
   /* public static void main(String[] args) {
        boolean b1 = 0;
        boolean b2 = 'false';
        boolean b3 = false; // rigth
        boolean b4 = Boolean.false;
        boolean b4 = Boolean.FALSE;// rigth
        boolean b5 = no;
    }
*/
    //№6
    /*public static void main(String[] args) {
        int result = 12 + 2 * 5 % 3 - 15 / 4; // 10
        String x = 12 - 6 + "Hello" + 7 + 5; // 6Hello75

        System.out.println(result + " - " + x); //10 - 6Hello75
    }*/

    //#5
    /*public static void main(String[] args) {
        int[] a = {5, 5};
        int b = 1;
        a[b] = b = 0;
        System.out.println(arrays.toString(a)); //[5, 0]
    }*/

    //#4
   /* public static void main(String[] args) {
        final Integer i = 1;
        switch (1) {
            case i: // Ошибка компиляции
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
    }*/

    //#3
    /*public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Double d1 = 10d;
        Double d2 = 10d;
        System.out.println(i1 == i2); //true//The JVM is caching Integer values. == only works for numbers between -128 and 127
        System.out.println(i1.equals(i2));//true
        System.out.println(d1 == d2);// false
        System.out.println(d1.equals(d2));//true
    }*/

    //#2
    /*private void method1() {
MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x = " + obj.x); // obj.x = 2
    }

    private void method2(MyClass param) {
        param.x = 2;
        param = new MyClass();
        param.x = 3;

    }

    class MyClass { int x;}

    public static void main(String[] args) {
        new Test().method1();
    }
*/


}
