package constructor;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){

    }

    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }
    public void getInf(){
        System.out.println(
                "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Breed: " + breed);
    }


}
