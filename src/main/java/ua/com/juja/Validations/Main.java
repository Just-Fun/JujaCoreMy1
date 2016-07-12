package ua.com.juja.Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serzh on 2/11/16.
 */
public class Main {
    public static final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются! таюланд, аланд";

    public static void main(String[] args) {

//        String s = "Paroba 1";
////        System.out.println(s.matches("^\\w+\\s\\w$"));
////        System.out.println(s.replaceFirst("a", "b"));
//        System.out.println(s.replace("ro", "be"));
//        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

     /*   String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        int i = validationString.indexOf('d');
        System.out.println(i);*/

     /*   System.out.println(test("trololo.com"));     //true
        System.out.println(test("trololo.ua "));     //false
        System.out.println(test("trololo.ua"));      //true
        System.out.println(test("trololo/ua"));      //false
        System.out.println(test("i love java because it is cool.ru"));      //true
        System.out.println(test("BACON.ru"));        //true
        System.out.println(test("BACON.de"));        *///false
       /* System.out.println(test1("pizza"));   //true
        System.out.println(test1("@pizza"));  //false
        System.out.println(test1("pizza3"));  //false
*/
        Pattern p = Pattern.compile("(\\D+)(\\d+)(\\D+)(\\d+)(\\D+)");
        Matcher m = p.matcher("это круто  1 регулярные якороль выражения это круто 30 якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные в");
        if (m.find()) {
            System.out.println(m.group(2));
        }
    }


    public static boolean test1(String testString) {
        Pattern p = Pattern.compile("^[^a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static boolean test(String testString) {
        Pattern p = Pattern.compile("\\S+\\.(com|ua|ru)"); //".+\\.(com|ua|ru)"
        Matcher m = p.matcher(testString);
        return m.matches();
    }


}
