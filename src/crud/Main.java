package crud;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Customer customer = new Customer();
//
//
//
//
//        Customer customer1 = new Customer();
//        customer1.setId(1L);
//        customer1.setFullName("Saikal Kasmaalieva");
//        customer1.setEmail("s@gmail.com");
//        customer1.setDateOfBirth(LocalDate.of (2003, 6, 29));
//        customer1.setPhoneNumber("+996703003522");
//
//        Customer customer2 = new Customer();
//        customer2.setId(2L);
//        customer2.setFullName("Aizat Duisheeva");
//        customer2.setEmail("a@gmail.com");
//        customer2.setDateOfBirth(LocalDate.of (2003, 3, 13));
//        customer2.setPhoneNumber("+996702439388");
//
//
//        //CREAT
//        System.out.println("-----------------------------CREAT-------------------------------------");
//        customer.createCustomer(customer1);
//        customer.createCustomer(customer2);
//
//
//
//        //GET ALL
//        System.out.println("-----------------------------GET ALL-------------------------------------");
//        System.out.println(Arrays.toString(customer.getAllCustomer()));
//
//        //GET BY ID
//        System.out.println("-----------------------------GET BY ID-------------------------------------");
//        System.out.println(customer.getByIdCustomer(1L));
//
//        //UPDATE
//        System.out.println("-----------------------------UPDATE-------------------------------------");
//        Customer updateCustomer = new Customer();
//        updateCustomer.setFullName("Aiana");
//        updateCustomer.setEmail("a@gmail.com");
//        customer.updateCustomerById(2L, updateCustomer);
//
//        System.out.println("-----------------------------GET ALL-------------------------------------");
//        System.out.println(Arrays.toString(customer.getAllCustomer()));

//        //DELETE
//        System.out.println("----------------------------DELETE-------------------------------------");
//        customer.deleteCustomerById(2L);
//
//        System.out.println("-----------------------------GET ALL-------------------------------------");
//        System.out.println(Arrays.toString(customer.getAllCustomer()));
//    }


        Founder founder = new Founder();
        Scanner scannerForNumber = new Scanner(System.in);
        Scanner scannerForString = new Scanner(System.in);
        Founder founder1 = new Founder();
        System.out.println("Write id: ");
        founder1.setId(scannerForNumber.nextLong());
        System.out.println("Write full name: ");
        founder1.setFullName(scannerForString.nextLine());
        System.out.println("Write founder company: ");
        founder1.setFounderCompany(scannerForString.nextLine());
        System.out.println("Write date of foundation: ");
        founder1.setDateOfFoundation(LocalDate.of(scannerForNumber.nextInt(),scannerForNumber.nextInt(),scannerForNumber.nextInt()));
        System.out.println("Write address: ");
        founder1.setAddress(scannerForString.nextLine());

        Founder founder2 = new Founder();
        System.out.println("Write id 2: ");
        founder1.setId(scannerForNumber.nextLong());
        System.out.println("Write full name 2: ");
        founder1.setFullName(scannerForString.nextLine());
        System.out.println("Write founder company 2: ");
        founder1.setFounderCompany(scannerForString.nextLine());
        System.out.println("Write date of foundation 2: ");
        founder1.setDateOfFoundation(LocalDate.of(scannerForNumber.nextInt(),scannerForNumber.nextInt(),scannerForNumber.nextInt()));
        System.out.println("Write address 2: ");
        founder1.setAddress(scannerForString.nextLine());

        Founder founder3 = new Founder();
        System.out.println("Write id 3: ");
        founder1.setId(scannerForNumber.nextLong());
        System.out.println("Write full name 3: ");
        founder1.setFullName(scannerForString.nextLine());
        System.out.println("Write founder company 3: ");
        founder1.setFounderCompany(scannerForString.nextLine());
        System.out.println("Write date of foundation 3: ");
        founder1.setDateOfFoundation(LocalDate.of(scannerForNumber.nextInt(),scannerForNumber.nextInt(),scannerForNumber.nextInt()));
        System.out.println("Write address 3: ");
        founder1.setAddress(scannerForString.nextLine());

        founder.creatFounder(founder1);
        founder.creatFounder(founder2);
        founder.creatFounder(founder3);

        founder.getAllFounder();







    }
}
