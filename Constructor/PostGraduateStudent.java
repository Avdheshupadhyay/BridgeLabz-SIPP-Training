// PostGraduateStudent.java
// Demonstrates use of protected member
public class PostGraduateStudent extends Student {
    private String specialization;

    public PostGraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("Name: " + name + ", Specialization: " + specialization);
    }
}
