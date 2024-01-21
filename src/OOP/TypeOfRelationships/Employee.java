package OOP.TypeOfRelationships;

public class Employee {
    private int id;
    private float salary;
    private PersonalInfo personalInfo; // relationship composition or aggregation
    private Department department; // relationship composition or aggregation

    public Employee(int id, float salary, String firstname, String lastname, String nationality, int yearOfBirth, Department department) {
        this.id = id;
        this.salary = salary;
        this.personalInfo = new PersonalInfo(firstname, lastname, nationality, yearOfBirth);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", department=" + department +
                '}';
    }

}
