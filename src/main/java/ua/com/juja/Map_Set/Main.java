package ua.com.juja.Map_Set;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serzh on 13.02.16.
 */
public class Main {
    static class Account {
        private int amount;

        public Account(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void income(int amount) {
            this.amount += amount;
        }

        @Override
        public String toString() {
            return "" + amount + "$";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Account account = (Account) o;

            return amount == account.amount;

        }

        @Override
        public int hashCode() {
            return amount;
        }

        /*@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Account account = (Account) o;

            return amount != null ? amount.equals(account.amount) : account.amount == null;

        }

        @Override
        public int hashCode() {
            return amount != null ? amount.hashCode() : 0;
        }*/
    }

    public static void main(String[] args) {
        Map<String, Account> debts = new HashMap<String, Account>();
        debts.put("Stiven Pupkn", new Account(-30));
        debts.put("Eva Pupka", new Account(-305));
        debts.put("Bob Marley", new Account(-305));

        System.out.println("Stiven Pupkn = " + debts.get("Stiven Pupkn"));
        System.out.println("Eva Pupka = " + debts.get("Eva Pupka"));
        System.out.println("Bob Marley = " + debts.get("Bob Marley"));

        debts.get("Bob Marley").income(300);
        System.out.println(debts.toString());

        for (Map.Entry<String, Account> entry : debts.entrySet()) {
            entry.getValue().income(5);
            System.out.println(entry.toString());
        }

        if (debts.get("Bob Marley").getAmount() == 0) {
         debts.remove("Bob Marley");
        }
        System.out.println(debts.toString());

        System.out.println("**** Bob Marley exist " + debts.containsKey("Bob Marley"));

        System.out.println("**** 25$ exist " + debts.containsValue(new Account(-25)));

    }
}
