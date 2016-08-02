package ua.com.juja.Interviews.Epam.Epam_test_6;

/**
 * Created by serzh on 4/18/16.
 */
public class Main {
    //#1
    // как можно уничтожить объект в java?
    //Этого нельзя сделать вручную. Только Garbage Collector может уничтожить объект.
    // Если всем ссылкам на объект присвоить null, то сам объект станет доступным для сборщика мусора

    public static void main(String[] args) {
        /*SynchDirectories main = new SynchDirectories();
        System.out.println(main.getClass()); // class ua.com.juja.Interviews.Epam.Epam_test_6.SynchDirectories
        System.out.println(SynchDirectories.class);      // class ua.com.juja.Interviews.Epam.Epam_test_6.SynchDirectories
        System.out.println(main.getClass() == SynchDirectories.class); // true*/

        //№2
        /*char ch = '0';
        System.out.println(ch < 9); // false
        System.out.println(ch == 0); // false
        System.out.println(ch); // 0
        System.out.println(++ch); // 1
        for (; ch < 9; ch++) {
            System.out.println(ch); // ничего не напечатает
        }*/

        //№4
      /*  int i = 3;
        switch (i) { //выведет default, 1, 2  наверное из-за того что default в начале, а не в конце...
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }*/

        //#5
//        System.out.println("method() returned " + method());
        // вывод:
//        i = 0
//        Finally block
//        i = 1
//        Exception!
//        Finally block
//        method() returned 1

        //№6
        /*MyLink b1 = new MyLink();
        MyLink b2 = b1;
        b2.str = "My String";
        System.out.println(b1.str); // My String, так как объект MyLink один, а b1 и b2 только ссылки на него
        String a1 = "Test";
        String a2 = a1;
        System.out.println(a2); // Test
        a1 = "Not a Test";
        System.out.println(a2); // Test*/

        //#7
        /*Integer i = new Integer("10");
        System.out.println(i.toString().equals(i.toString())); // true
        System.out.println(i.toString() == i.toString()); // false
        if (i.toString() == i.toString()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный"); // Неравный
        }*/

        /*
        vkuchyn [1:37 PM]
        А теперь посмотри реализацию toString класа Integer
        public static String toString(int i) {
        if (i == Integer.MIN_VALUE)
            return "-2147483648";
        int size = (i < 0) ? stringSize(-i) + 1 : stringSize(i);
        char[] buf = new char[size];
        getChars(i, size, buf);
        return new String(buf, true);
    }

        В конце `return new String(buf, true);` - согласно String pool создается новый объект.
         */

        //#8
        /*ClassA a = new ClassB();
        System.out.println(a.x); // 1
        System.out.println(a.getX()); // 3, ничего не понимаю
        ClassB b = new ClassB();
        System.out.println(b.x); // 2
        System.out.println(b.getX());
*/
        //#9
        /*Car myCar = new Car();
        System.out.println(myCar.myCar); // Ferrari*/




    }

    //№5
    /*static int method() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            try {
                if (i == 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exception!");
                return i;
            } finally {
                System.out.println("Finally block");
            }
        }
        return -1;
    }*/


}
