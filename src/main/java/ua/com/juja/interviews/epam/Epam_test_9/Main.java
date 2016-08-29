package ua.com.juja.interviews.epam.Epam_test_9;

/**
 * Created by serzh on 4/25/16.
 */
public class Main {
    public static void main(String[] args) {
        //#2
        /*double p = Double.POSITIVE_INFINITY;
        double n = Double.NEGATIVE_INFINITY;
        System.out.println(
                ((long)p > (long)n) + " " +  // true
                ((int)p > (int) n) + " " +   // true
                ((short)p > (short) n) + " " +// false
                ((char)p > (char) n) + " " + // true
                ((byte)p > (byte) n)         // false
        );

        System.out.println((short)p);
        System.out.println((short)n);
        System.out.println((char)p);
        System.out.println((char)n);
        System.out.println((byte)p);
        System.out.println((byte)n);*/

        //#4
       /* byte i = 0;
        Integer i2 = 127; // кешируеться(от -118 до 127)
        var(i, i2); //int... x
        Integer i3 = 1290; // тут уже не кешируется,но все же...
        var(i, i3); //int... x

        var(i3, i); //iInteger int
        var(i3, i, i); //int... x
//        var(i3, i3, i3); //        Error:(34, 9) java: reference to var is ambiguous*/

        //#5
    /*    String str = "19";
        str.concat(".5");
        System.out.println(str); //19
//        String s2 = str.concat(".5");
//        System.out.println(s2); //19.5
//
//        str.substring(1);
//        System.out.println(str);//19
//
//        String s3 = str.substring(1);
//        System.out.println(s3);//9

        Double d = new Double(str);
        System.out.println(d); //19.0
        Long l = new Long(str);
        System.out.println(l); //19
        System.out.println(d.intValue() + d.doubleValue() + l.doubleValue()); //57.0
        System.out.println(d.intValue());//19
        System.out.println(d.doubleValue());//19.0
        System.out.println(l.doubleValue());//19.0*/

        //#6
        /*
        В чем особенность класса-обертки для void?
        a.) Этот класс, в отличие от остальных классов-оберток, НЕ реализует
        интерфейс java.io.Serializable. Он не имеет открытого конструктора. Более
        того, экземпляр этого класса вообще не может быть получен.
         */

        //#


    }


    //#4
    public static void var(Integer x, int y) {
        System.out.println("Integer int");
    }

    public static void var(Object x) {
        System.out.println("Object");
    }

    public static void var(int... x) {
        System.out.println("int... x");
    }

    public static void var(Integer... x) {
        System.out.println("Integer...");
    }


}
