package ua.com.juja.interviews.epam.Epam_test_8;

/**
 * Created by serzh on 4/25/16.
 */
public class Test extends One {
    public static void main(String[] args) {
        new Test(); // при инициализации j стало 12
        System.out.println(One.j); // j - статическая переменная, то-есть одна на класс..
    } // вывод: 12
}
