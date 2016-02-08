package ua.com.juja.List;

/**
 * Created by serzh on 2/8/16.
 */
public class Main {

    public static void main(String[] args) {
        Table table = new Table("WE", 2);
        Table1 table1 = new Table1("WE", 2);

        int hCode = table.hashCode();
        int hCode1 = table1.hashCode();

        int h = table.s.hashCode();
        int h1 = table1.s1.hashCode();

        System.out.println(h);
        System.out.println(h1);
        System.out.println(hCode);
        System.out.println(hCode1);
    }

    static class Table {
        int i = 1;
        String s = "RT";

        public Table(String s, int i) {
            this.s = s;
            this.i = i;
        }
    }

    static class Table1 {
        int i1 = 1;
        String s1 = "RT";

        public Table1(String s, int i) {
            this.s1 = s;
            this.i1 = i;
        }
    }
}
