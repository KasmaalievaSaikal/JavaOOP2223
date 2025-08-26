package abstraction;

public class BMW extends Car{

    @Override
    public void gas() {
        System.out.println("Gas");
    }

    @Override
    public void brake() {
        System.out.println("Brake 1");
    }

    public BMW() {
    }

    public BMW(String model, String color, int maxSeed) {
        super(model, color, maxSeed);
    }

}
