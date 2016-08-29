package ua.com.juja.interviews.epam.Epam_test_8;

/**
 * Created by serzh on 4/22/16.
 */
public class Main {
    public static void main(String[] args) {
        //#1
//        new Class2(0.0);

        //#2
        /*int x = 18;
        int y = x++;
        System.out.println(x); // 19
        if (x == 18 && y > 10) { // x++ уже...
            System.out.println("something");
        }
*/
        //#3
        /*try {
            ((A) new B()).process();// вывод A/n Exception, то-есть не приводиться что ли?
        } catch (Exception e) {
            System.out.println("Exception ");
        }*/

        //#5
       /* A1 a1 = new A1();
        a1.method();
        A1 ab = new B1();
        ab.method();
        B1 b1 = new B1();
        b1.method();*/
        // скомпилируется, если и main добавить:
        //throws IOException || throws Exception
        // и нет, если:
        // throw! Exception || FileNotFoundException
        // так понимаю IOException выше по иерархии FileNotFoundException

        //№6
        /*outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");*/
        //вывод:
        //Hello
        //Hello
        //Good-Bye

        //#8
        /*switch (new Integer(4)) {
            case 4:
                System.out.println("4"); // 4
                break;
            default:
                System.out.println("defaul");
        }*/

        //#9
        /*Integer i = new Integer("10");
        if (i.toString().intern() == i.toString().intern()) {
            System.out.println("Равный"); // Равный
        } else {
            System.out.println("Не равный");

        }*/





    }
    //#4
    //Какие из перечисленных методов объявлены корректно?
    /*void modifyTotal(Object ... args) {}
    void doAnyth(int i, Object ... args) {}
//    void confirm(Object ... args, int i) {} // Vargar parameter must be the last in the list
//    void setRate(int... i, float... f) {} // Vargar parameter must be the last in the list
    void doSmth(int i, Object ...args) {}
*/


}
