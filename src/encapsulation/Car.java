package encapsulation;

public class Car {

    private String brand;
    private String model;
    private int price;
    private int realised;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getRealised() {
        return realised;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRealised(int realised) {
        this.realised = realised;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand: " + brand + '\'' +
                "Model: " + model + '\'' +
                "Price: " + price + '\''+
                "Realised: " + realised +
                '}';
    }
}
