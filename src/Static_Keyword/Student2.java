package Static_Keyword;

/* -------------- STATIC METHODS -------------- */

public class Student2 {
   private int studentId;
    private String studentName;
    private String studentPassword;
    private boolean loggedIn;
    private static int count = 1;
    private static String studentCollage = "IT";
    private static int minPasswordLength = 6;


    public Student2(String studentName, String studentPassword) {
        this.studentId = count;
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        count++;
    }


    public boolean isLoggedIn(int enteredStudentId, String enteredStudentPassword) {
        if (enteredStudentId == studentId && enteredStudentPassword.equals(studentPassword)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }


    // Static methods for validate the length of the password
    public static boolean validation(String password) {
        if (password.length() >= minPasswordLength) {
            return true;
        }
            return false;
    }


}
