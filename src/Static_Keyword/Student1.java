package Static_Keyword;

/* -------------- STATIC VARIABLES -------------- */

public class Student1 {
    int studentId;
    // static variable with initialization
    // static variable to keep track of the count of instances
    static int count = 1;
    String studentName;
    // static variable with initialization
    static String studentCollage = "IT";

    public Student1(String studentName) {

        this.studentId = count; // THE ID of the student will increment for each new student
        this.studentName = studentName;
        count++; // constructor increments the instance count
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

