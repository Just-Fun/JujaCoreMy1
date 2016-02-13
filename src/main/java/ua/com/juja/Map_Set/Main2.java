package ua.com.juja.Map_Set;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serzh on 13.02.16.
 */
public class Main2 {
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
    private static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            return name != null ? name.equals(user.name) : user.name == null;

        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }

    public static void main(String[] args) {
        Map<User, Account> debts = new HashMap<User, Account>();
        User stiven = new User("Stiven Pupkn");
        debts.put(stiven, new Account(-30));
        User eva = new User("Eva Pupka");
        debts.put(eva, new Account(-305));
        User bob = new User("Bob Marley");
        debts.put(bob, new Account(-305));

        System.out.println("Stiven Pupkn = " + debts.get(stiven));
        System.out.println("Eva Pupka = " + debts.get(eva));
        System.out.println("Bob Marley = " + debts.get(bob));

        debts.get(bob).income(300);
        System.out.println(debts.toString());

        for (Map.Entry<User, Account> entry : debts.entrySet()) {
            entry.getValue().income(5);
            System.out.println(entry.toString());
        }

        System.out.println("Remove Bob Marley");
        if (debts.get(bob).getAmount() == 0) {
         debts.remove(new User("Bob Marley"));
        }
        System.out.println(debts.toString());

        System.out.println("**** Bob Marley exist " + debts.containsKey(bob));

        System.out.println("**** 25$ exist " + debts.containsValue(new Account(-25)));

    }
}
