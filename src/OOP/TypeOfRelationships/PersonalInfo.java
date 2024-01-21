package OOP.TypeOfRelationships;

public class PersonalInfo {
    private String firstname;
    private String lastname;
    private String nationality;
    private int yearOfBirth;

    public PersonalInfo() {
    }

    public PersonalInfo(String firstname, String lastname, String nationality, int yearOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
