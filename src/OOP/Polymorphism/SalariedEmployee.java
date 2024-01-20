package OOP.Polymorphism;

public class SalariedEmployee extends Employee{
    private float bounce;

    public SalariedEmployee() {}

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bounce) {
        super(name, address, department, email, salary);
        this.bounce = bounce;
    }

    public float getBounce() {
        return bounce;
    }

    public void setBounce(float bounce) {
        this.bounce = bounce;
    }

    // Override the getSalary Method
    @Override
    public float getSalary() {
        return salary + bounce;
    }
}
