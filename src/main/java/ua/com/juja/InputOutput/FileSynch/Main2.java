package ua.com.juja.InputOutput.FileSynch;

/**
 * Created by Serzh on 8/2/16.
 */
public class Main2 {
    public static void main(String[] args) {

       first: for (int i = 0; i < 3; i++) {
            second: for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue first;
                } else {
                    System.out.println(i * j);
                }
            }
        }
    }
}
