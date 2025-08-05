public class Programmer {
    String name;
    String surname;
    int age;


    public void getYear(){
        System.out.println("Year: " + (2025 - age));
    }
    public void getInf(){
        System.out.println(
                "Name: " + name + "\n" +
                        "Surname: " + surname + "\n" +
                        "Age: " + age);
        System.out.println("Birth year this programmer: ");
    }

}