package extraSession;

public class House {

    private String address;
    private int numberOfRooms;
    private double area;


    public House() {

    }

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }


    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(int price) {
        return area * price;

    }


    @Override
    public String toString() {
        return (
                "Address: " + address + '\n' +
                        " NumberOfRooms: " + numberOfRooms + "\n" +
                        "Area: " + area);
    }
}
