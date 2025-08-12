package extraSession;

public class Main {
    public static void main(String[] args) {


        House house = new House("Vostok-5", 4, 5.6);

        System.out.println(house);


        System.out.println("Total price: " + house.calculatePrice(1200));
    }
}
