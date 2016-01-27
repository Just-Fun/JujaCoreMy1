package ua.com.juja.A5FifthWeek.callCenter;

/**
 * Created by serzh on 12/22/15.
 */
public class CallCenter {

    int numOfOperators;
    Operator[] operators;
    int attempts = 3;

    public CallCenter(int numOfOperators) {
        operators = new Operator[numOfOperators];
        for (int i = 0; i < numOfOperators; i++) {
            operators[i] = new Operator(false, i + 1);
        }
    }

//    public Operator findFreeOperator(Operator[] operators) {
//        for (int i = 0; i < operators.length; i++) {
//            if (operators[i].isFree()) {
//                System.out.println("Find operators #" + i);
//                operators[i].makeBisy();
//                return operators[i];
//            }
//        }
//        return waitFoFreeOperator();
//    }

    private void waitFoFreeOperator() {
        while (attempts > 0) {
            System.out.println("Please wait 2 seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            attempts--;
            if (attempts == 0) {
                System.out.println("Sorry, call in one hour.");
                return;
            }
            findFreeOperator(this);
        }
    }


    public String findFreeOperator(CallCenter callCenter) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i].isFree()) {
//                System.out.println("Find operators #" + operators[i].getNum() + ".\n" + operators[i].toString());
                operators[i].makeBisy();
                return "Find operators #" + operators[i].getNum() + ".\n" + operators[i].toString();
            } else {
                waitFoFreeOperator();
            }
        }
        return null;
    }
}
