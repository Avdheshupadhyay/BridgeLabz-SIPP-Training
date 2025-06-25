// Manager.java
// Demonstrates access to public member and adds department
public class Manager extends Employee {
    private String department;

    public Manager(int employeeId, double salary, String department) {
        super(employeeId, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeId + ", Department: " + department);
    }
}
