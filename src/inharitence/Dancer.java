package inharitence;

public class Dancer extends Person {


    private String groupName;

    public Dancer() {
    }


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);

        this.groupName = groupName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer learning");
    }

    @Override
    public void walk() {
        System.out.println("Dancer walking");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eating");
    }

    public void dance() {
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Group name: " + groupName);
    }
}
