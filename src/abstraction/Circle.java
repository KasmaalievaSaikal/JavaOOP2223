package abstraction;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private final double P = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * P * radius;

    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
