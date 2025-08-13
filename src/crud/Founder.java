package crud;

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

    Founder[] founders = new Founder[6];
    int count = 0;

    public Founder[] creatFounder(Founder founder) {
        founders[count++] = founder;
        System.out.println("Success");
        return founders;
    }

    public Founder[] getAllFounder() {
        return founders;
    }

    public Founder getByIdFounder(long id) {
        for (Founder founder : founders) {
            if (founder.getId() == id) {
                return founder;
            }
        }
        return null;
    }

    public void updateFounderById(long id, Founder newFounder) {
        Founder oldFounder = getByIdFounder(id);
        oldFounder.setFullName(newFounder.getFullName());
        oldFounder.setFounderCompany(newFounder.getFounderCompany());
        System.out.println("Success");
    }

    public void deleteFounderById(long id) {
        int index = -1;

        for (int i = 0; i < founders.length; i++) {
            if (founders[i].getId() == id) {
                index = i;
                break;
            }
        }
        Founder[] newFounders = new Founder[founders.length - 1];
        for (int i = 0; i < index; i++) {
            newFounders[i] = founders[i];
        }
        for (int i = index; i < newFounders.length; i++) {
            newFounders[i] = founders[i + 1];
        }
        System.out.println(Arrays.toString(newFounders));
        founders = newFounders;
    }

    @Override
    public String toString() {
        return "Founder{" +
                "id=" + id +
                "FullName: " + fullName + '\'' +
                "FounderCompany: " + founderCompany + '\'' +
                "DateOfFoundation: " + dateOfFoundation + '\'' +
                "Address: " + address + '\'' +
                "Founders: " + Arrays.toString(founders) + '\'' +
                "Count: " + count +
                '}';
    }
}
