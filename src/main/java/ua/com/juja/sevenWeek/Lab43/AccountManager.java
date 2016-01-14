package ua.com.juja.sevenWeek.Lab43;

import java.util.Arrays;

/**
 * Created by serzh on 1/13/16.
 */
public class AccountManager {

    public static boolean transfer(Account[] accounts, int[] delta) {
        boolean transferAll = false;

        Account[] accounts1 = Arrays.copyOf(accounts, accounts.length);

        for (int i = 0; i < accounts.length; i++) {
            boolean done = false;
            while (!done) {
                try {
                    accounts[i].change(delta[i]);
                    done = true;
                    transferAll = true;
                } catch (TryAgainException e) {
                    done = false;
                    transferAll = false;
                } catch (BlockAccountException e) {
                    accounts = Arrays.copyOf(accounts1, accounts.length);
                    transferAll = false;
                    break;
                }
            }
        }
        return transferAll;
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
