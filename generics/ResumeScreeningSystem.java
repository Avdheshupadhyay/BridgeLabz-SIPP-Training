import java.util.*;

// === Base Resume Class ===
abstract class Resume {
    String candidateName;
    int yearsOfExperience;

    public Resume(String candidateName, int yearsOfExperience) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void display();
    public abstract boolean isEligible();
}

// === Software Engineer Resume ===
class SoftwareEngineerResume extends Resume {
    List<String> programmingLanguages;

    public SoftwareEngineerResume(String name, int exp, List<String> languages) {
        super(name, exp);
        this.programmingLanguages = languages;
    }

    @Override
    public void display() {
        System.out.println("Software Engineer: " + candidateName +
            " | Exp: " + yearsOfExperience + " yrs | Languages: " + programmingLanguages);
    }

    @Override
    public boolean isEligible() {
        return yearsOfExperience >= 2 && programmingLanguages.contains("Java");
    }
}

// === Data Scientist Resume ===
class DataScientistResume extends Resume {
    List<String> tools;
    boolean hasMLProject;

    public DataScientistResume(String name, int exp, List<String> tools, boolean hasMLProject) {
        super(name, exp);
        this.tools = tools;
        this.hasMLProject = hasMLProject;
    }

    @Override
    public void display() {
        System.out.println("Data Scientist: " + candidateName +
            " | Exp: " + yearsOfExperience + " yrs | Tools: " + tools +
            " | ML Project: " + (hasMLProject ? "Yes" : "No"));
    }

    @Override
    public boolean isEligible() {
        return yearsOfExperience >= 1 && hasMLProject;
    }
}

// === Generic ResumeProcessor Class ===
class ResumeProcessor<T extends Resume> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

// === Utility class with generic & wildcard methods ===
class ResumeUtils {

    // Generic method to filter eligible resumes
    public static <T extends Resume> List<T> getEligibleCandidates(List<T> resumes) {
        List<T> eligible = new ArrayList<>();
        for (T resume : resumes) {
            if (resume.isEligible()) {
                eligible.add(resume);
            }
        }
        return eligible;
    }

    // Wildcard method to display any type of resumes
    public static void displayAllResumes(ResumeProcessor<?> processor) {
        for (Resume resume : processor.getResumes()) {
            resume.display();
        }
    }
}

// === Main Class ===
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Software Engineer Resumes
        ResumeProcessor<SoftwareEngineerResume> seProcessor = new ResumeProcessor<>();
        seProcessor.addResume(new SoftwareEngineerResume("Alice", 3, Arrays.asList("Java", "Python")));
        seProcessor.addResume(new SoftwareEngineerResume("Bob", 1, Arrays.asList("C++", "Go")));

        // Data Scientist Resumes
        ResumeProcessor<DataScientistResume> dsProcessor = new ResumeProcessor<>();
        dsProcessor.addResume(new DataScientistResume("Charlie", 2, Arrays.asList("Python", "R"), true));
        dsProcessor.addResume(new DataScientistResume("Dana", 1, Arrays.asList("Excel", "SQL"), false));

        // Display all
        System.out.println("=== All Software Engineer Resumes ===");
        ResumeUtils.displayAllResumes(seProcessor);

        System.out.println("\n=== All Data Scientist Resumes ===");
        ResumeUtils.displayAllResumes(dsProcessor);

        // Filter and display eligible candidates
        System.out.println("\n=== Eligible Software Engineers ===");
        for (Resume r : ResumeUtils.getEligibleCandidates(seProcessor.getResumes())) {
            r.display();
        }

        System.out.println("\n=== Eligible Data Scientists ===");
        for (Resume r : ResumeUtils.getEligibleCandidates(dsProcessor.getResumes())) {
            r.display();
        }
    }
}
