public class Passport {

    Long id;
    String firstName;
    String lastName;
    int yearOfBirth;
    String gender;
    String countryOfBirth;


    public void getInf(){
        System.out.println(
                "Id: " + id + "\n" +
                        "Firstname: " + firstName + "\n" +
                        "Lastname: " + lastName + "\n" +
                        "Year of birth: " + yearOfBirth + "\n" +
                        "Gender: " + gender + "\n" +
                        "Country of birth: " + countryOfBirth);
    }


}
