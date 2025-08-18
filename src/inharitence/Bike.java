package inharitence;

public class Bike extends Technic {

    private int price;
    private int maxSpeed;


    public Bike() {
    }

    public Bike(String name, String brand) {
        super(name, brand);
    }

    public Bike(int price, int maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Bike(String name, String brand, int price, int maxSpeed) {
        super(name, brand);
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getBike() {
        System.out.println(getName());
        System.out.println(getBrand());
        System.out.println("Price: " + price);
        System.out.println("MAx speed: " + maxSpeed);
    }

}
