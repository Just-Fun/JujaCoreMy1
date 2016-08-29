package ua.com.juja.interviews.epam.Epam_test_3;

/**
 * Created by serzh on 4/1/16.
 */
//#2 ошибки компиляции
public class Clidders {
    public final void flipper() {
        System.out.println("Flip a Clidder");
    }

    /*public class Clidlets extends Clidders {
        public void flipper() {                 // flipper final - нельзя переопределять
            System.out.println("Flip a Clidlet");
            super.flipper();
        }

        public static void main(String[] args) { // внутренний класс(inner) cannot have stati declaration
            new Clidlets().flipper();
        }
    }*/
}
