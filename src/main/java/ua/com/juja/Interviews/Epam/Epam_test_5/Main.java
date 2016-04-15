package ua.com.juja.Interviews.Epam.Epam_test_5;

/**
 * Created by serzh on 4/15/16.
 */
public class Main {
    public static void main(String[] args) {
        //# 1
/*//        int v1 = 081; // ошибка компиляции
        int v2 = 0x81;
        System.out.println(v2); // 129
        float v3 = 0x81;
        System.out.println(v3); // 129.0
//        float v4 = 0.81;  // ошибка компиляции, хочет в конце f или F
//        byte v5 = 0x81; // ошибка компиляции    */

        //#2
        /*long x = 5;
        long y = 2;
        long s = x / y;
        System.out.println(s); // 2
        byte b = (byte) (x / y);
        System.out.println(b); // 2*/

        //#3 напечатает finally
        /*try {
          int i = 5;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }*/

        //№4
        /*System.out.println(0.0/0.0 + 10);*/ //"NaN" -> NaN (англ. Not-a-Number) — одно из особых состояний числа с плавающей запятой
        //Данное состояние может возникнуть в различных случаях, например, когда предыдущая математическая операция завершилась с
        // неопределённым результатом или если в ячейку памяти попало не удовлетворяющее условиям число.
        // напр. деление нуля на нуль;

        //№5
        /*int a = 10;
        int b = 100;
        int temp = a/b;
        System.out.println(temp);
        double c = (double) (a/b); // 0
        String str = String.format("%1.4f", c);
        System.out.println(str); // 0.0000
        String str2 = String.format("%1.2f", c);
        System.out.println(str2); // 0.00*/

    }








}
