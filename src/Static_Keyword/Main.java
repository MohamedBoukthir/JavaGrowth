package Static_Keyword;

/*   USE CASES:
     -> Storing values that are shared by all instances of a class.
     -> Keeping track of the count of instances created for a class.
     -> Maintaining constants that are common to all instances.
*/

public class Main {
    public static void main(String[] args) {
                                            /* STATIC METHODS */

        Student2 s1 = new Student2("ali","123");

        System.out.println(s1.isLoggedIn(1, "123")); // output : true
        System.out.println(s1.isLoggedIn(1, "1234")); // output : false



        /* STATIC VARIABLES */
        /* Static variables have class scope, meaning they can be accessed directly from the class, even without creating an instance. */

//        Student1 s1 = new Student1("Mohamed Boukthir");
//        Student1 s2 = new Student1("Daniel Maldini");
//        Student1 s3 = new Student1("Anis Boukthir");
//        Student1 s4 = new Student1("Example name");
//        Student1 s5 = new Student1("another example");
//
//        System.out.println(s1.toString()); // output :  Student{studentId=1, studentName='Mohamed Boukthir'}
//        System.out.println(s2.toString()); // output :  Student{studentId=2, studentName='Daniel Maldini'}
//        System.out.println(s3.toString()); // output :  Student{studentId=3, studentName='Anis Boukthir'}
//        System.out.println(s4.toString()); // output :  Student{studentId=4, studentName='Example name'}
//        System.out.println(s5.toString()); // output :  Student{studentId=5, studentName='another example'}

    }
}
