package abstraction;

public abstract class Car {

    private String model;
    private String color;
    private int maxSeed;


    public Car() {
    }

    public Car(String model, String color, int maxSeed) {
        this.model = model;
        this.color = color;
        this.maxSeed = maxSeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSeed() {
        return maxSeed;
    }

    public void setMaxSeed(int maxSeed) {
        this.maxSeed = maxSeed;
    }

    public abstract void gas();
    public abstract void  brake();


    @Override
    public String toString() {
        return "Car{" +
                "Model: " + model + '\'' +
                "Color: " + color + '\'' +
                "MaxSeed: " + maxSeed +
                '}';
    }
}
