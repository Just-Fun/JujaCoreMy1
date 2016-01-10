package ua.com.juja.OOP.My;

/**
 * Created by serzh on 12/18/15.
 */
public class SimpleHouse {

    private int floosCount;
    private int appartmentOnFloor;

    public SimpleHouse(int floosCount, int appartmentOnFloor) {
        this.floosCount = floosCount;
        this.appartmentOnFloor = appartmentOnFloor;
    }

    @Override
    public String toString() {
        String result = "House:\n";
        for (int x = 0; x < floosCount; x++) {
            for (int y = 0; y < appartmentOnFloor; y++) {
                result += "#";
            }
            result += "\n";
        }
        return result;
    }
}
