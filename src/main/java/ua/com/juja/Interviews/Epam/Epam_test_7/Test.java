package ua.com.juja.Interviews.Epam.Epam_test_7;

/**
 * Created by serzh on 4/21/16.
 */

public class Test {
    static int[] arrInstance = new int[100];
    public static void main(String[] args) {
        //#1
        /*ElectricInverter inverter = new ElectricInverter();
        int AC = 220;
        System.out.println(inverter.invert(AC)); // 0
        int x = 2;
        System.out.println(x); // 2
        System.out.println(~x);// -3
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(~x));
        System.out.println(Integer.toBinaryString(1)); // 0000...001
        System.out.println(Integer.toBinaryString(-1));// 1111...110*/

        //#2
     /*   byte[] arrLocal = new byte[100];
        for (int i = 0; i < 100; i++) {
            if (arrInstance[i] != arrLocal[i]) {
                throw new IllegalStateException("error"); // программа выполнится без ошибок
            }                                             // просто массивы не инициализированы...
        }
        System.out.println(arrInstance[1]); // 0
        System.out.println(arrInstance[2]); // 0
        System.out.println(arrLocal[1]); // 0
        System.out.println(arrLocal[2]); // 0*/

        /*int num = 0;
        int[] arrInstance1 = new int[100];
        for (int i = 0; i < arrInstance1.length; i++) {
            arrInstance1[i] = num++;
        }

        byte num1 = 0;
        byte[] arrLocal1 = new byte[100];
        for (int i = 0; i < arrLocal1.length; i++) {
            arrLocal1[i] = num1++;
        }

        for (int i = 0; i < 100; i++) {
            if (arrInstance1[i] != arrLocal1[i]) {
                throw new IllegalStateException("error");// программа выполнится без ошибок
            }
        }*/

        //#3
        /*TheClass c = new TheClass();
        TheInterface i = c;
        i.print(); // TheClass*/

        //#4
        /*String strA = "text";
        String strB = "text";
        strA += "1";
        strB += "1";
        System.out.println(strA == strB); // false, видимо при += образовывается new Object
        System.out.println(strA.intern() == strB.intern());// true
        strA = "text1";
        strB = "text1";
        System.out.println(strA == strB); // true
        System.out.println(strA.equals(strB)); // true

//        "123" == "123"                          // true
//        ("12" + "3").intern() == "123"          // true
//        new String("123") == new String("123")  // false
//        new String("123") == "123"              // false
//        new String("123").intern() == "123"     // true
*/

        //#



    }


}

class ElectricInverter {
    public static final int AC = ~220;
    public static final int DC = -110;

    public static final int GROUND = 0;

    int invert(int type) {
        if (type == AC) {
            return DC;
        } else if (type == DC) {
            return AC;
        }
        return GROUND;
    }
}



























