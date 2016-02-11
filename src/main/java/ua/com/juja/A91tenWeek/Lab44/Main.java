package ua.com.juja.A91tenWeek.Lab44;

import java.io.IOException;

/**
 * Created by serzh on 2/11/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {


     /*   String i = "3";
        int i1 = Integer.valueOf(i);
        System.out.println(i1)*/
        ;


        String s = "";
        s += "<person>n";
        int age = 4;
        String name = "Vasia";
        s += "    <age>" + age + "</age>n";
        s += "    <name>" + name + "</name>n";
        s += "</person>n";
        System.out.println(s); // <person>n    <age>4</age>n    <name>Vasia</name>n</person>n
        char[] chars = s.toCharArray();
        String ageToString = "";
        String nameToString = "";
        int countBegin = 0;
        int countEnd = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '<') {
                countEnd++;
            }

            if (countBegin > 1 && countEnd < 3) {
                ageToString += Character.toString(chars[i]);
            }

            if (countBegin > 3 && countEnd < 5) {
                nameToString += Character.toString(chars[i]);
            }

            if (chars[i] == '>') {
                countBegin++;
            }
        }

        System.out.println(ageToString);
        System.out.println(nameToString);

    }
}
