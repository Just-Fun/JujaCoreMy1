package ua.com.juja.A91tenWeek.Lab44;

import java.io.*;

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
        Person person = null;
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

        char[] chars = s.toCharArray();

        String age = "";
        String name = "";
        int countBegin = 0;
        int countEnd = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '<') {
                countEnd++;
            }

            if (countBegin > 1 && countEnd < 3) {
                age += Character.toString(chars[i]);
            }

            if (countBegin > 3 && countEnd < 5) {
                name += Character.toString(chars[i]);
            }

            if (chars[i] == '>') {
                countBegin++;
            }
        }
        int age1 = Integer.valueOf(age);
        person = new Person(name, age1);
        return person;
    }

    @Override
    public Point readPoint() throws IOException {
        return null;
    }
}
