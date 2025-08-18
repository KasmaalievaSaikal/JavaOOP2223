package inharitence;

public class Technic {
    private String name;
    private String brand;


    public Technic() {

    }

    public Technic(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void getInf() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
    }

}