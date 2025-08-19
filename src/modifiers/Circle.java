package modifiers;

public class Circle {

    private static double PI;
    private static double radius;

    public Circle() {
    }

    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public static void area() {
        System.out.println(PI * (radius * radius));
    }

    public static void circumference() {
        System.out.println(PI * 2 * radius);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
