package crud;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;


    public Customer() {

    }

    public Customer(long id, String fullName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //TODO Database

    Customer[] customers = new Customer[10];
    int count = 0;

    // TODO CRUD
    // TODO CRUD C - creat

    public void createCustomer(Customer customer) {
        customers[count++] = customer;
        System.out.println("Success: ");
    }

    // TODO R - read

    public Customer[] getAllCustomer() {
        return customers;
    }

    public Customer getByIdCustomer(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    //TODO UPDATE

    public void updateCustomerById(long id, Customer newCustomer) {
        Customer oldCustomer = getByIdCustomer(id);
        oldCustomer.setFullName(newCustomer.getFullName());
        oldCustomer.setEmail(newCustomer.getEmail());
        System.out.println("Success");
    }


    //TODO DELETE

    public void deleteCustomerById(long id) {
        int index = -1;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = i;
                break;
            }
        }




        Customer[] newCustomers = new Customer[customers.length - 1];
        for (int i = 0; i < index; i++) {
            newCustomers[i] = customers[i];
        }

        for (int i = index; i < newCustomers.length; i++) {
            newCustomers[i] = customers[i + 1];
        }
        System.out.println(Arrays.toString(newCustomers));

        customers = newCustomers;

    }


    @Override
    public String toString() {
        return "Customer{" +
                "\n id=" + id + "\n" +
                "FullName: " + fullName + "\n" +
                "Email: " + email + "\n" +
                "DateOfBirth: " + dateOfBirth + "\n" +
                "PhoneNumber: " + phoneNumber;

    }
}

