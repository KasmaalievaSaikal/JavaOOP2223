package polymorphism;

public class Person {
     private String name;


    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("Walking");
    }


    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
