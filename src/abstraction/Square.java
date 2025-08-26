package abstraction;

public class Square extends Shape {

    private double side;
    private static double P;


    public Square() {
    }


    public Square(double side) {
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
        return "Square{" +
                "side=" + side +
                '}';

    }
}
