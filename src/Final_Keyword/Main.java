package Final_Keyword;

public class Main {
    public static void main(String[] args) {
        /*

 final variable declaration
        final int STUDENT_ID = 123;
OR
        final int STUDENT_ID; // this form of declaration calls BLANK FINAL VARIABLE
        STUDENT_ID = 123;
AND
        final static int STUDENT_ID = 123; // final static variable
AND
        final Student student = new Student(123,"Mohamed Boukthir",22); // final reference

        */

        Student student = new Student(123,"Mohamed Boukthir",22);
        /* student.STUDENT_ID = 123;  --> Cannot assign a value to final variable 'STUDENT_ID' <-- */
    }
}
