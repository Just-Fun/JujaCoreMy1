package ua.com.juja.interviews.epam.Epam_test_3;

/**
 * Created by serzh on 4/1/16.
 */
//№6
public class A { // 2 раза вывод class java.lang.Byte, даже если закомментить "Byte[][]Byte = {{0}};", выводи тоже
    static {
//        Byte[][]Byte = {{0}};
        System.out.println(Byte.class);
    }
    public static void main(String[] args) {
        System.out.println(Byte.class);
    }
}
