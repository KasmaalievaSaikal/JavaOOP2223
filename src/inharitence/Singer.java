package inharitence;

public class Singer extends Person {


    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println("Singer learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer walking");
    }

    @Override
    public void eat() {
        System.out.println("Singer eating");
    }

    public void sing() {
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Band name: " + bandName);
    }
}
