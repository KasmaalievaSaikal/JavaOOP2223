package inharitence;

public class Programmer extends Person {


    private String companyName;


    public Programmer() {

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);

        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public void learn() {
        System.out.println("Programmer learning");
    }

    @Override
    public void walk() {
        System.out.println("Programmer walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eating");
    }

    public void code() {
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Company name: " + companyName);
    }
}
