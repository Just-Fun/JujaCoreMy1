package ua.com.juja.FifthWeek.callCenter;

/**
 * Created by serzh on 12/22/15.
 */
public class Operator {

    public boolean busy = false;
    private int num;

    public Operator(boolean busy,int num) {
        this.busy = busy;
        this.num = num;
    }

    public boolean isFree() {
        if (busy) {
            return false;
        } else {
            return true;
        }
    }

    public void makeBisy() {
        busy = true;
    }

    String status = busy ? "I am bisy." : "I a free";

    @Override
    public String toString() {
        return "I am operator # " + this.getNum() + ". "  + status;
    }


    public int getNum() {
        return num;
    }
}
