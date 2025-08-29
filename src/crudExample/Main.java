package crudExample;

import crudExample.models.Founder;
import crudExample.service.FounderService;
import crudExample.service.impl.FounderServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FounderService founderService = new FounderServiceImpl();
        Scanner scannerForNumber = new Scanner(System.in);
        Scanner scannerForString = new Scanner(System.in);


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    Choose command:
                    1.create
                    2.getAll
                    3.getById
                    4.update
                    5.delete
                    6.exit
                    """);

            int command = scannerForNumber.nextInt();


            switch (command) {
                case 1:
                    Founder founder = new Founder();
                    System.out.println("Write id: ");
                    founder.setId(scannerForNumber.nextLong());
                    System.out.println("Write full name: ");
                    founder.setFullName(scannerForString.nextLine());
                    System.out.println("Write founder company: ");
                    founder.setFounderCompany(scannerForString.nextLine());
                    System.out.println("Write date of foundation: ");
                    founder.setDateOfFoundation(LocalDate.of(scannerForNumber.nextInt(), scannerForNumber.nextInt(), scannerForNumber.nextInt()));
                    System.out.println("Write address: ");
                    founder.setAddress(scannerForString.nextLine());
                    founderService.creatFounder(founder);
                    break;
                case 2:
                    System.out.println(Arrays.toString(founderService.getAllFounder()));
                    break;
                case 3:
                    System.out.println("Write id for search: ");
                    System.out.println(founderService.getByIdFounder(scannerForNumber.nextInt()));
                    break;

                case 4:
                    System.out.println("Write old founder id: ");
                    long oldId = scannerForNumber.nextInt();
                    Founder updateFunder = new Founder();
                    System.out.println("New full name: ");
                    updateFunder.setFullName(scannerForString.nextLine());
                    System.out.println("New founder company: ");
                    updateFunder.setFounderCompany(scannerForString.nextLine());
                    founderService.updateFounderById(oldId, updateFunder);

                    break;
                case 5:
                    System.out.println("Write delete founder id: ");
                    founderService.deleteFounderById(scannerForNumber.nextInt());
                    break;

                case 6:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Founder not found!!");

            }
        }
    }
}