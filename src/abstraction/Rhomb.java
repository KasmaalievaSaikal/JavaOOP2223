package abstraction;

import java.awt.*;

public class Rhomb extends Shape {
    private double side;
    private static double P;


    public Rhomb() {
    }

    public Rhomb(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getPerimeter() {
        return P = 4 * side;
    }


    @Override
    public String toString() {
        return "Rhomb{" +
                "side=" + side +
                '}';
    }
}
