package ua.com.juja.codingbat.String_1;

/**
 * Created by serzh on 2/2/16.
 */
public class Main {

    public static void main(String[] args) {


        System.out.println(makeTags("i", "Hello"));
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);

    }


    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }


    public String comboString(String a, String b) {
        String shorter = "";
        String longer = "";
        if (a.length() < b.length()) {
            shorter += a;
            longer += b;
        } else {
            shorter += b;
            longer += a;
        }
        return shorter + longer + shorter;
    }


    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String firstHalf(String str) {

        return str.substring(0, str.length() / 2);
    }

    public String firstTwo(String str) {

        int length = str.length();
        if (length == 0) {
            return "";
        } else if (length > 1) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }


    public String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }


    public static String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}

//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"
