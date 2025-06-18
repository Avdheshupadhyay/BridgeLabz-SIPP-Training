// EmployeeBonusCalculator.java
// Program to calculate bonus, new salary, and total payout for 10 employees
import java.util.Random;

public class EmployeeBonusCalculator {
    // Method to generate salary and years of service for each employee
    // Returns a 2D array: [][0]=salary, [][1]=years of service
    public static int[][] generateEmployees(int count) {
        int[][] data = new int[count][2];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(15); // 1 to 15 years of service
        }
        return data;
    }
    // Method to calculate new salary and bonus for each employee
    // Returns a 2D array: [][0]=new salary, [][1]=bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[employees.length][2];
        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    // Method to display results in tabular format
    public static void displayResults(int[][] employees, double[][] results) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.printf("%-5s %-10s %-10s %-10s %-12s %-12s\n", "No.", "Salary", "Years", "Bonus", "New Salary", "Bonus Amt");
        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double newSalary = results[i][0];
            double bonus = results[i][1];
            sumOld += salary;
            sumNew += newSalary;
            sumBonus += bonus;
            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f %-12.2f\n", i+1, salary, years, bonus, newSalary, bonus);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-17s %-10.2f %-12.2f %-12.2f\n", "TOTALS", sumOld, sumNew, sumBonus);
    }
    public static void main(String[] args) {
        int[][] employees = generateEmployees(10);
        double[][] results = calculateBonus(employees);
        displayResults(employees, results);
    }
}
