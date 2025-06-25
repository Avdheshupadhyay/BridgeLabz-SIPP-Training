// Employee.java
// Access Modifiers Example
public class Employee {
    public int employeeId;
    private double salary;

    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
