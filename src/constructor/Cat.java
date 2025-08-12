package constructor;

public class Cat {
    String name;
    int age;
    String color;

    public Cat(){

    }

    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void getInf() {
        System.out.println(
                "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Color: " + color);
    }

}
