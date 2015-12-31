package ua.com.juja.FifthWeek.coinsChanger;

/**
 * Created by serzh on 12/28/15.
 */
public class ExchangeMoneyMy {
    private static int[] COINS_NOM = {1, 2, 5, 10, 25, 50};
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange == 0) return 0;
        return getCountOfWays(amountForExchange, 5);
    }

    private static int getCountOfWays(int money, int indexOfCoin) {
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        return getCountOfWays(money, indexOfCoin - 1) +
                getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin);
    }

}
