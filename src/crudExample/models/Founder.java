package crudExample.models;

import java.time.LocalDate;
import java.util.Arrays;

public class Founder {
    private long id;
    private String fullName;
    private String founderCompany;
    private LocalDate dateOfFoundation;
    private String address;


    public Founder() {

    }

    public Founder(long id, String fullName, String founderCompany, LocalDate dateOfFoundation, String address) {
        this.id = id;
        this.fullName = fullName;
        this.founderCompany = founderCompany;
        this.dateOfFoundation = dateOfFoundation;
        this.address = address;
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

    public String getFounderCompany() {
        return founderCompany;
    }

    public void setFounderCompany(String founderCompany) {
        this.founderCompany = founderCompany;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Founder{" +
                "id=" + id +
                "FullName: " + fullName + '\'' +
                "FounderCompany: " + founderCompany + '\'' +
                "DateOfFoundation: " + dateOfFoundation + '\'' +
                "Address: " + address + '\'' +
                '}';
    }
}
