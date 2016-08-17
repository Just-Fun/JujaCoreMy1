package ua.com.juja.InputOutput.Lab44;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serzh on 2/11/16.
 */
public class EntityOutputWriter {

    private final Writer out;

    public EntityOutputWriter(Writer out) {
        this.out = out;
    }

    public void writePerson(Person person) throws IOException {
        int age = person.getAge();
        String name = person.getName();
        out.write("<person>n");
        out.write("    <age>" + age + "</age>n");
        out.write("    <name>" + name + "</name>n");
        out.write("</person>n");
        out.flush();
    }

    //    @Override
    public void writePoint(Point point) throws IOException {
        out.write("<point x=" + point.getX() + " y=" + point.getY() + "></point>n");
        out.flush();
    }
}

interface EntityInput {
    public Person readPerson() throws IOException;

    public Point readPoint() throws IOException;
}

interface EntityOutput {
    public void writePerson(Person person) throws IOException;

    public void writePoint(Point point) throws IOException;
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (x < 0 || 15 < x) {
            throw new IllegalArgumentException();
        }
        if (y < 0 || 15 < y) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" + x + ", " + y + "}";
    }
}

class EntityInputReader implements EntityInput {
    private Reader in;

    public EntityInputReader(Reader in) {
        this.in = in;
    }

    @Override
    public Person readPerson() throws IOException {

        String s = "";

        try {
            boolean end = false;
            while (!end) {
                int read = in.read();
                if (read == -1) {
                    end = true;
                    continue;
                }
                char c = (char) read;
                s += c;

            }
            in.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String ageP = "(\\D+)(\\d+)(\\D+)";
        String nameP = "(<name>)(\\w*)(</name>n)";


        int age = Integer.valueOf(parseString(s, ageP, 2));
        String name = parseString(s, nameP, 2);
        Person person = new Person(name, age);
        return person;
    }
    private static String parseString(String input, String regex, int num) {
        String result = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            result += matcher.group(num);
        }
        return result;
    }



    @Override
    public Point readPoint() throws IOException {
        //<point x=1 y=2></point>n

        String s = "";

        try {
            boolean end = false;
            while (!end) {
                int read = in.read();
                if (read == -1) {
                    end = true;
                    continue;
                }
                char c = (char) read;
                s += c;

            }
            in.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        int x = 0;
        int y = 0;

        String regex = "(\\D+)(\\d+)(\\D+)(\\d+)(\\D+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            x = Integer.valueOf(matcher.group(2));
            y = Integer.valueOf(matcher.group(4));
        }
        Point point = new Point(x, y);

        return point;
    }
}
