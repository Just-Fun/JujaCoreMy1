package ua.com.juja.Practice;

import java.nio.charset.Charset;

/**
 * Created by Oleg on 7/25/2016.
 */
public class Main4 {
    public static void main(String[] args) {
//        Charset charset = Charset.defaultCharset();
//        System.out.println(charset.displayName());


    }

    public int getSum(int a, int b) {

        while(b!=0){
            int c = a&b;
            a=a^b;
            b=c<<1;
        }

        return a;
    }
}
