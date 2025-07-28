import java.util.*;

// Base class for all courses
abstract class Course {
    String courseName;
    String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public abstract void displayInfo();
}

// Undergraduate course
class UndergraduateCourse extends Course {
    int semester;

    public UndergraduateCourse(String name, String code, int semester) {
        super(name, code);
        this.semester = semester;
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate: " + courseName + " (" + courseCode + ") | Semester: " + semester);
    }
}

// Postgraduate course
class PostgraduateCourse extends Course {
    String specialization;

    public PostgraduateCourse(String name, String code, String specialization) {
        super(name, code);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate: " + courseName + " (" + courseCode + ") | Specialization: " + specialization);
    }
}

// Doctorate course
class DoctorateCourse extends Course {
    String researchArea;

    public DoctorateCourse(String name, String code, String researchArea) {
        super(name, code);
        this.researchArea = researchArea;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctorate: " + courseName + " (" + courseCode + ") | Research: " + researchArea);
    }
}

// Generic class to manage courses
class CourseManager<T extends Course> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourses() {
        return courseList;
    }
}

// Utility class with wildcard method
class CourseUtils {
    public static void displayAllCourses(CourseManager<?> manager) {
        for (Course course : manager.getCourses()) {
            course.displayInfo();
        }
    }
}

// Main class
public class UniversityCourseManager {
    public static void main(String[] args) {
        // Undergraduate courses
        CourseManager<UndergraduateCourse> ugManager = new CourseManager<>();
        ugManager.addCourse(new UndergraduateCourse("Physics", "UG101", 2));
        ugManager.addCourse(new UndergraduateCourse("Mathematics", "UG102", 4));

        // Postgraduate courses
        CourseManager<PostgraduateCourse> pgManager = new CourseManager<>();
        pgManager.addCourse(new PostgraduateCourse("Data Science", "PG201", "AI & ML"));
        pgManager.addCourse(new PostgraduateCourse("Cyber Security", "PG202", "Network Security"));

        // Doctorate courses
        CourseManager<DoctorateCourse> phdManager = new CourseManager<>();
        phdManager.addCourse(new DoctorateCourse("Quantum Computing", "PHD301", "Quantum Algorithms"));

        // Display all
        System.out.println("== Undergraduate Courses ==");
        CourseUtils.displayAllCourses(ugManager);

        System.out.println("\n== Postgraduate Courses ==");
        CourseUtils.displayAllCourses(pgManager);

        System.out.println("\n== Doctorate Courses ==");
        CourseUtils.displayAllCourses(phdManager);
    }
}
