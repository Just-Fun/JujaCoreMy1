package ua.com.juja.sevenWeek.Lab43;

/**
 * Created by serzh on 1/13/16.
 */
public class AccountManager {

    public static boolean transfer(Account[] accounts, int[] delta) {
        /*BODY*/
        return false;
    }
}

abstract class Account {
    protected int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public abstract void change(int delta) throws TryAgainException, BlockAccountException;

    public int getAmount() {
        return amount;
    }
}


class TryAgainException extends Exception {
}

class BlockAccountException extends Exception {
}
