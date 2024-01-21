package OOP.TypeOfRelationships;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1,"IT");

        Employee employeeOne = new Employee(
                123,
                1000,
                "Mohamed",
                "Boukthir",
                "Tunisian",
                2001,
                department);
        Employee employeeTwo = new Employee(
                124,
                1200,
                "Joe",
                "Doe",
                "American",
                2000,
                department);

        System.out.println(employeeOne); // output : Employee{id=123, salary=1000.0, personalInfo=PersonalInfo{firstname='Mohamed', lastname='Boukthir', nationality='Tunisian', yearOfBirth=2001}, department=Department{departmentId=1, departmentName='IT'}}
        System.out.println(employeeTwo); // output : Employee{id=124, salary=1200.0, personalInfo=PersonalInfo{firstname='Joe', lastname='Doe', nationality='American', yearOfBirth=2000}, department=Department{departmentId=1, departmentName='IT'}}
    }
}
