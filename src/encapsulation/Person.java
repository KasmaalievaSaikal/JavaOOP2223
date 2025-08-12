package encapsulation;

public class Person {
    private String name;
    private String surname;
    private String nation;
    private int age;


    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getNation(){
        return nation;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name: " + name + '\'' +
                "Surname: " + surname + '\'' +
                "Nation: " + nation + '\'' +
                "Age: " + age +
                '}';
    }
}
