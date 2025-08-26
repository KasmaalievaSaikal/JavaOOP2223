package abstraction;

public class Main {
    public static void main(String[] args) {


//        BMW bmw1 = new BMW("X6", "White", 400);
//        BMW bmw2 = new BMW("X7", "Black", 500);
//        Lexus lexus1 = new Lexus("L470", "Beige", 300);
//        Lexus lexus2 = new Lexus("L570", "Blue", 400);
//
//        System.out.println(bmw1);
//        System.out.println(bmw2);
//        System.out.println(lexus1);
//        System.out.println(lexus2);
//
//        System.out.println("--------------------------BMW------------------------------");
//        bmw1.gas();
//        bmw1.brake();
//        bmw2.gas();
//        bmw2.brake();
//        System.out.println("--------------------------BMW------------------------------");
//        lexus1.gas();
//        lexus1.brake();
//        lexus2.gas();
//        lexus2.brake();


        Shape triangle = new Triangle(2, 5, 6);
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(6, 4);
        Shape rhomb = new Rhomb(6);
        Shape circle = new Circle(7);

        System.out.println(triangle.getPerimeter());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rhomb.getPerimeter());
        System.out.println(circle.getPerimeter());

    }
}
