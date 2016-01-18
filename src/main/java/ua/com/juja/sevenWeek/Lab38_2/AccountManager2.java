package ua.com.juja.sevenWeek.Lab38_2;

import java.util.Arrays;

/**
 * Created by serzh on 1/15/16.
 */
public class AccountManager2 {

    public static boolean transfer(Account[] accounts, int[] delta) {

        boolean transferAll = false;
//        Account[] accountsTemp = Arrays.copyOf(accounts, accounts.length);
        Account[] accountsTemp = accounts.clone();
//        int[] accAmount = new int[accounts.length];
//        for (int i = 0; i < accAmount.length; i++) {
//            accAmount[i] = accounts[i].getAmount();
//        }

        for (int i = 0; i < accounts.length; i++) {
            boolean done = false;
            while (!done) {
                try {
                    accountsTemp[i].change(delta[i]);
                    done = true;
                    transferAll = true;
                } catch (TryAgainException e) {
                    done = false;
                    transferAll = false;
                } catch (BlockAccountException e) {
//                    accounts = Arrays.copyOf(accountsTemp, accounts.length);
//                    for (int j = 0; j < accounts.length; j++) {
//                        accounts[j] = new Account(accAmount[j]) {
//                            @Override
//                            public void change(int delta) throws TryAgainException, BlockAccountException {
//                            }
//                        };
//                    }
                    transferAll = false;
                    done = true;
                    break;
                }
            }
        }
        if (transferAll) {
            accounts = Arrays.copyOf(accountsTemp, accounts.length);
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
