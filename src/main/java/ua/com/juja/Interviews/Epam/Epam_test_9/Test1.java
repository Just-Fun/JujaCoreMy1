package ua.com.juja.Interviews.Epam.Epam_test_9;

/**
 * Created by serzh on 4/26/16.
 */
//#9
public class Test1 {
    private String helloString = "Hello.";

    public Test1(int i) {
        class Inner {
            public Inner(String str) { // Вставьте код:
//                System.out.println(Test1);
//                System.out.println(i);//Error:local variable i is accessed from within inner class; needs to be declared final
//                System.out.println(String.valueOf(i));//Error:local variable i is accessed from within inner class; needs to be declared final
                System.out.println(Test1.this.helloString); // только эта
                System.out.println(new Test1(1).helloString);// эту сам добавил
            }
        }
        Inner inner = new Inner("Goodbye.");
    }
}