package encapsulation;

public class University {
    private String name;
    private String location;
    private String city;
    private int year;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location
                ;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public  void getInf(){
        System.out.println(
                "Name: " + name + "\n" +
                        "Location: " + location + "\n" +
                        "City: " + city + "\n" +
                        "Year: " + year);
    }
}
