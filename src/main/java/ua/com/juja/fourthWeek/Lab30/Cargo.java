package ua.com.juja.fourthWeek.Lab30;

/**
 * Created by serzh on 12/17/15.
 */
public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax <= 0) {
            return DEFAULT_RENTAL * this.getTonnage();
        }
        return rentTax * this.getTonnage();
    }

    @Override
    public float calculatePayment() {
        return DEFAULT_RENTAL * this.getTonnage();
    }

    public float getTonnage() {
        return tonnage;
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
