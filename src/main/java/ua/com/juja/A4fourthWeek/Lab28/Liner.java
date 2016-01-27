package ua.com.juja.A4fourthWeek.Lab28;

/**
 * Created by serzh on 12/17/15.
 */
public class Liner extends AbstractShip{
    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL * this.Getpassengers();
    }

    public float calculatePayment(float rentTax) {
        if (rentTax <= 0) {
        return DEFAULT_RENTAL * this.Getpassengers();
        }
        return rentTax * this.Getpassengers();
    }

    private float Getpassengers() {
        return passengers;
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
