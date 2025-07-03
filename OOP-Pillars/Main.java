import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000, 5000);
        fte.assignDepartment("HR");
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 300, 40);
        pte.assignDepartment("IT");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("---");
        }
    }
}
