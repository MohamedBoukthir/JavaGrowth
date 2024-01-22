package Final_Keyword;

// final clasS
final public class Student {
    final int STUDENT_ID;
    String name;
    int age;
    final static float DEGREE_OF_SUCCESS = 50;

    public Student(final int STUDENT_ID /* final parameter */, String name, int age) {
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.age = age;
    }

    // final method
    @Override
    final public String toString() {
        return "Student{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
