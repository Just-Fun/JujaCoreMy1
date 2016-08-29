package ua.com.juja.practice;

/**
 * Created by serzh on 23.07.16.
 */
public class AccountManager {
    public static void main(String[] args) {
        Account account = new Account(5) {
            @Override
            public void change(int delta) throws TryAgainException, BlockAccountException {

            }
        };
        System.out.println();
    }


    public static boolean transfer(Account[] accounts, int[] delta) {

        int[] amount = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            amount[i] = accounts[i].getAmount();
        }

        for (int k = 0; k < accounts.length; k++) {
            boolean stop = false;
            while (!stop) {
                try {
                    accounts[k].change(delta[k]);
                    stop = true;
                } catch (TryAgainException e) {

                } catch (BlockAccountException e) {
                    for (int k1 = 0; k1 < accounts.length; k1++) {
                        accounts[k1] = new Account(amount[k1]) {
                            @Override
                            public void change(int delta) throws TryAgainException, BlockAccountException {

                            }
                        };
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

abstract class Account implements Cloneable {
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
