package ua.com.juja.a4fourthWeek.Lab29;

/**
 * Created by serzh on 12/17/15.
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL * this.getVolume();
    }

    public float calculatePayment(float rentTax) {
        if (rentTax <= 0) {
            return DEFAULT_RENTAL * this.getVolume();
        }
        return rentTax * this.getVolume();
    }


    public float getVolume() {
        return volume;
    }
}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}