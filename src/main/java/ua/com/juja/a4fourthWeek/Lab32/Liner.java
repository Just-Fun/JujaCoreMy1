package ua.com.juja.a4fourthWeek.Lab32;

import java.util.Arrays;

/**
 * Created by serzh on 12/17/15.
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return passengers * rentTax;
        } else {
            return calculatePayment();
        }
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


class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL = 550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        if (arrayShips == null) return "";

        int size = arrayShips.length;
        float[] floats = new float[size];
        for (int i = 0; i < size; i++) {
            floats[i] = arrayShips[i].calculatePayment();
        }
        Arrays.sort(floats);
        String out = "";
        for (float f : floats) {
            for (int i = 0; i < size; i++) {
                if (f == arrayShips[i].calculatePayment()) {
                    out += arrayShips[i].getName() + "=" + arrayShips[i].calculatePayment();
                }
            }
        }

        return out;
    }
}

