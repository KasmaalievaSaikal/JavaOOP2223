package polymorphism;

public class Main {
    public static void main(String[] args) {
//        Person[] people = {
//                new Programmer(),
//                new Dancer(),
//                new Singer()};
//        for (Person person : people) {
//            person.walk();
//        }


        Animal[] animals = {
                new Shark(),
                new Turtle(),
                new Eagle()
        };


      for(Animal animal : animals){
          System.out.println(animal.getClass());
      }

        System.out.println("--------------------------Turtle---------------------------------");

        int count1 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Turtle) {
                count1++;
            }
        }

        Turtle[] turtles = new Turtle[count1];

        int index1 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Turtle) {
                turtles[index1] = (Turtle) animal;
                index1++;
            }
        }
        for (Turtle turtle : turtles) {
            turtle.swim();
        }

        System.out.println("--------------------------Shark---------------------------------");


        int count2 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                count2++;
            }
        }

        Shark[] sharks = new Shark[count2];

        int index2 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[index2] = (Shark) animal;
                index2++;
            }
        }
        for (Shark shark : sharks) {
            shark.attack();
        }

        System.out.println("--------------------------Eagle---------------------------------");

        int count3 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Eagle) {
                count3++;
            }
        }

        Eagle[] eagles = new Eagle[count3];

        int index3 = 0;
        for (Animal animal : animals) {
            if (animal instanceof Eagle) {
                eagles[index3] = (Eagle) animal;
                index3++;
            }
        }
        for (Eagle eagle : eagles) {
            eagle.fly();
        }
    }
}
