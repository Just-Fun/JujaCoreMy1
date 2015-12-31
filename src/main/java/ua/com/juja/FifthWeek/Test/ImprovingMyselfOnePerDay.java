package ua.com.juja.FifthWeek.Test;

/**
 * Created by serzh on 12/30/15.
 */
public class ImprovingMyselfOnePerDay {

    public static void main(String[] args) {
        ImprovingMyselfOnePerDay res = new ImprovingMyselfOnePerDay();
        float ans = res.improve(365);
        float ans2 = res.deImprove(365);

        System.out.println(ans);
        System.out.println(ans2);

    }

    int result = 101;

    private float improve(float days) {
        result += result * 0.01;
        days--;
        if (days > 0) {
            improve(days - 1);
        }

        return result;
    }

    private float deImprove(float days) {
        result -= result * 0.01;
        days--;
        if (days > 0) {
            deImprove(days - 1);
        }

        return result;
    }
}
