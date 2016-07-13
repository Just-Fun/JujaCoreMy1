package ua.com.juja.Collections.List;

import java.io.*;

/**
 * Created by serzh on 2/8/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {


        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.toString());

     /*   String i = "3";
        int i1 = Integer.valueOf(i);
        System.out.println(i1)*/;

/*
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
        System.out.println(nameToString);*/


//       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//       BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

       /* FileReader reader = new FileReader("/home/serzh/Videos/text.txt");
        char[] buffer = new char[1];
        StringBuilder builder = new StringBuilder();
        while (reader.read(buffer) != -1) {
            builder.append(buffer);
            System.out.println(builder);
            System.out.println(Arrays.toString(buffer));
            System.out.println(new String(buffer));
            buffer = new char[32];
        }
        System.out.println("Whole: " + builder);*/

    }

}
