package constructor;

public class MyClass {
    String name;
    String surname;
    int age;
    String[] subject;
    String favouriteFood;

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public MyClass(String name, String surname, int age, String[] subject, String favouriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
        this.favouriteFood = favouriteFood;
    }

    public void getInf1() {
        System.out.println(
                "Name: " + name + "\n" +
                        "Surname: " + surname + "\n" +
                        "Age: " + age + "\n" +
                        "Subject: " + subject + "\n" +
                        "Favourite food: " + favouriteFood);
    }

    public void getInf2() {
        System.out.println("Subjects: ");
        for (String subject1 : subject) {
            System.out.println(subject1);
        }
        System.out.println("My favourite food: " + favouriteFood);
        System.out.println();
    }


}

