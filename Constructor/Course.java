// Course.java
// Instance vs Class Variables and Methods
public class Course {
    private String courseName;
    private int duration;
    private double fees;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fees: " + fees + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
