package inharitence;

public class Car extends Technic {

    private int age;
    private String color;

    public Car() {
    }

    public Car(String name, String brand, int age, String color) {
        super(name, brand);
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getCar() {
        System.out.println(getName());
        System.out.println(getBrand());
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);

    }
}
