package OOP.Inheritance;

/*
    To implement inheritance in Java, a child class must include the keyword "extends" followed by the name of the parent class.
    This enables the compiler to understand that the child class is inheriting the parent class
*/

public class Cs_student extends Student {
    String projectName;


    public Cs_student(String firstname, String lastname, String email, String phone, String department, String projectName) {
        super(firstname, lastname, email, phone, department);
        this.projectName = projectName;


        /*
      Understanding the interplay between constructors in the base and derived classes is crucial when dealing with inheritance in Java.
      The super keyword is used to refer to the base class's members and constructors.
        */


    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
