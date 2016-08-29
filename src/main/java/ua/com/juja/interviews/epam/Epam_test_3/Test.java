package ua.com.juja.interviews.epam.Epam_test_3;

/**
 * Created by serzh on 4/1/16.
 */
public class Test {

    //#8 Какие из следующих строк скомпилируются без ошибок?
    public static void main(String[] args) {
        float[] f1[], f2; //да
        String[] names[]; // да
        int[][] scores = {{1, 2}, {1, 2, 3, 4}, {1, 2, 3}}; //да
    }

    //#7
    /*public static void main(String[] args) {
        for (final int i: new int[]{1,2,3}) {
            System.out.println(i + 1); // 2,3,4
        }
    }
*/
    //№5
    /*public static void main(String[] args) {
        int i = 1;
        long j = 1;
        if (i == 1) {
            int k = 1;
            if (i == k) {
                System.out.println("i equals k");
            }
        } else if (j == k) { //ошибка компиляции "к" - не видится отсюда...
            System.out.println("j equals k");
        }
    }
*/
    //#4 Какие из нижеследующих сигнатур могут быть использованы для объявления метода main()? (Выберите все допустимые.)
    /*public static void main() {} // нет
    public static void main(String args[]) {} //да
    public void main(String[] args) {} // нет
    public static void main(String[] args) {} // да
    public static int main(String[] args) {} // нет
*/

    //#2
    /*static int i;
    public static void main(String[] args) {
        System.out.println(i); //0
    }*/

    //#1
    /*public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.toString()); //Epam_test_3.Test@7ea987ac*/


}
