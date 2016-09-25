package ua.com.juja.algorithms.LAB18_Parser;

/**
 * Created by serzh on 11/27/15.
 */
public class Parser1 {
    public static void main(String[] args) {
//        System.out.println(eval("21*(1+3)"));
        System.out.println(eval("123"));
        System.out.println(eval("2*3"));
        System.out.println(eval("(1+3)*2"));
        System.out.println(eval("((13/6)*2-5)+1"));
//        2*(1+3) -> (1+3)*2    ( 1 + 3 ) * 2
//                             [1 2 3 4 5 6 7]
    }

    public static int eval(String expr) {
        return eval(expr, expr.length() - 1, 0);
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(from) == ')') {
            return eval(expr, from - 1, to + 1);
        } else {
            int pos = from;
            while (pos >= to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    int rightOperand = Integer.valueOf(expr.substring(pos + 1, from + 1));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, pos - 1, to);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(to , from + 1));
        }
    }
}
