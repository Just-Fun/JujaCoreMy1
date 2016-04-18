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
        int i = 3;
        switch (i) { //выведет default, 1, 2  наверное из-за того что default в начале, а не в конце...
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }




    }


}
