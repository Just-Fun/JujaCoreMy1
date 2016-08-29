package ua.com.juja.interviews.epam.Epam_test_4;

/**
 * Created by serzh on 4/15/16.
 */
//#10
public class C {
    static  {
        D[] D = new D[3];
        for (int i = 0; i < 3; i++) {
            D[i] = new D(i);
        }
//        System.out.println(D.b); // ошибка компиляции, если бы в main, то вывело бы "23"
    }

    public static void main(String[] args) {
        C pd = new C();
    }
}

