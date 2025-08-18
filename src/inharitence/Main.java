package inharitence;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("BMW","X6", 1916, "White");
//        Bike bike = new Bike("Yamaha", "MT-9", 1000000,240);
//
//
//
//
//        System.out.println("-----------------------Car----------------------------");
//        car.getCar();
//        System.out.println("-----------------------Bike----------------------------");
//        bike.getBike();

        Programmer programmer = new Programmer("Baitenir", "Programmer","Peaksoft");
        Dancer dancer = new Dancer("Saikal", "Dancer", "Shattyk");
        Singer singer = new Singer("Aizat", "Singer", " Kyz-Burak");



        System.out.println("-----------------------------------Programmer----------------------------------");
        programmer.code();
        System.out.println("-----------------------------------Dancer----------------------------------");
        singer.sing();
        System.out.println("-----------------------------------Singer----------------------------------");
        dancer.dance();




    }
}
