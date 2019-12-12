public class Human {
    String firstName;
    String lastName;
    String gender;
    int year;

    public Human(String firstname, String lastname, String gender, int year) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.gender = gender;
        this.year = year;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
