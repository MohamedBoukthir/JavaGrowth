package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "Mohamed",
                "Tunisia",
                "IT",
                "med@gmail.com",
                1200);

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Mohamed",
                "Tunisia",
                "IT",
                "med@gmail.com",
                1200,
                100);

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Mohamed",
                "Tunisia",
                "IT",
                "med@gmail.com",
                1200,
                15,
                8);

        DailyEmployee dailyEmployee = new DailyEmployee(
                "Mohamed",
                "Tunisia",
                "IT",
                "med@gmail.com",
                1200,
                20,
                5);


        System.out.println(employee.getSalary() + " USD."); // output : 1200.0 USD.
        System.out.println(salariedEmployee.getSalary() + " USD."); // output : 1300.0 USD.
        System.out.println(hourlyEmployee.getSalary() + " USD."); // output : 120.0 USD.
        System.out.println(dailyEmployee.getSalary() + " USD."); // output : 100.0 USD.


        /*
             In Java, upcasting is a concept related to polymorphism, specifically in the context of class hierarchies and inheritance.
             Upcasting allows you to treat an object of a derived class as an object of its base class. This is a fundamental aspect of polymorphism,
             where a variable of a base class type can refer to an object of any derived class.
        */

        // How ?
//        Employee employee = new Employee(
//                "Mohamed",
//                "Tunisia",
//                "IT",
//                "med@gmail.com",
//                1200);
//        System.out.println(employee.getSalary()); // output : 1200.0
//
//        employee = new DailyEmployee("Mohamed",
//                "Tunisia",
//                "IT",
//                "med@gmail.com",
//                1200,
//                15,
//                10);
//        System.out.println(employee.getSalary()); // output : 150.0


        // ---------- CAN WE OVERRIDE A STATIC METHODS ? ----------

//        Employee employee = new SalariedEmployee();
//        employee.print(); // output : Superclass

        //  SO
        /*
             it's not possible to override static methods in Java. However, static methods are associated with the class itself,
             not with instances of the class, and they are resolved at compile time, not runtime.
        */


    }
}
