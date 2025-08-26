package abstraction;

public class Lexus extends Car{

    @Override
    public void gas() {
        System.out.println("Drive");
    }

    @Override
    public void brake() {
        System.out.println("Brake 2");
    }

    public Lexus() {
    }

    public Lexus(String model, String color, int maxSeed) {
        super(model, color, maxSeed);
    }
}
