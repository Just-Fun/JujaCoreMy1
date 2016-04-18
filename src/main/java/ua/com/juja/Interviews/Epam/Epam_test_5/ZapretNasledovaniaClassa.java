package ua.com.juja.Interviews.Epam.Epam_test_5;

/**
 * Created by serzh on 4/18/16.
 */
//#10
public /*final*/ class ZapretNasledovaniaClassa { //1 вариант: добавить модификатор final
    static int i;

    private ZapretNasledovaniaClassa() { // 2 вариант: объявить private конструктор
        i = 5;
    }
}
