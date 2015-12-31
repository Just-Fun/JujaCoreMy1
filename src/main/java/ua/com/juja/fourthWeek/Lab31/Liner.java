package ua.com.juja.fourthWeek.Lab31;

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

interface SeaPortQueue {
    public final static int LENGTH_QUEUE_SHIP = 3;

    public int addShipToEndQueue(AbstractShip ship);

    public int removeShipFromBeginQueue();

    public String printQueueShip();
}

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == 2) {
            return -1;
        } else {
            indexShipInPort++;
            arrayShip[indexShipInPort] = ship;
            return indexShipInPort;
        }
    }

    public int removeShipFromBeginQueue() {
        if (indexShipInPort == -1) {
            return -1;
        } else {
            indexShipInPort--;
            arrayShip[0] = arrayShip[1];
            arrayShip[1] = arrayShip[2];
            arrayShip[2] = null;
            return 1;
        }
    }

    public String printQueueShip() {
        String out = "";
        if (indexShipInPort == -1) {
            return "QueueEmpty";
        } else {

            for (int i = 0; i < indexShipInPort + 1; i++) {
                out += "{" + arrayShip[i].toPrint() + "};";
            }
            return out;
        }
    }
}

