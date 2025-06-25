// EmployeeMain.java
// Test class for Employee

public class EmployeeMain {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("Alice", 101, 50000);
        Employee emp2 = new Employee("Bob", 102, 60000);
        
        // Display details
        System.out.println("=== Employee 1 ===");
        emp1.displayDetails();
        System.out.println("\n=== Employee 2 ===");
        emp2.displayDetails();
    }
}
