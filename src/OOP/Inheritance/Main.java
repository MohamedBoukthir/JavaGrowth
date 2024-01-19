package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        Cs_student csStudent1 = new Cs_student(
                "Mohamed",
                "Boukthir",
                "medboukthir7@gmail.com",
                "22228464",
                "Computer Science",
                "E-commerce Website"
        );

        System.out.println(csStudent1.getFirstname()); // output : Mohamed
        System.out.println(csStudent1.getLastname()); // output : Boukthir
        System.out.println(csStudent1.getEmail()); // output : medboukthir7@gmail.com
        System.out.println(csStudent1.getPhone()); // output : 22228464
        System.out.println(csStudent1.getDepartment()); // output : Computer Science
        System.out.println(csStudent1.getProjectName()); // output : E-commerce Website


        /*
          in Java, the superclass can also inherit from another class.
          When a class is defined in Java without explicitly specifying a superclass, it is by default a subclass of the Object class,
          which is the root of the class hierarchy in Java
        */

//        Student student = new Student();
//        System.out.println(student.toString()); // output : OOP.Inheritance.Student@5b480cf9
//        System.out.println(student.hashCode()); // output : 1531448569
//        System.out.println(student.getClass()); // output : class OOP.Inheritance.Student

    }
}
