package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write name: ");
            String name = scanner.nextLine();
            System.out.println("Write age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new RuntimeException("Jash minus san bolo albait!");
            }


        } catch (RuntimeException exeption) {
            System.out.println(exeption.getMessage());
        }

    }
}
