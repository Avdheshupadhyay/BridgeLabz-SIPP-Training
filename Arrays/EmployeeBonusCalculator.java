import java.util.Scanner;

/**
 * Program to calculate bonus for 10 employees based on their years of service
 * and to compute the total bonus payout along with old and new salary totals.
 */
public class EmployeeBonusCalculator {
    private static final int EMPLOYEE_COUNT = 10;
    private static final double HIGH_BONUS_RATE = 0.05; // 5% for > 5 years
    private static final double LOW_BONUS_RATE = 0.02;  // 2% for <= 5 years

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        // Collect validated input
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            salaries[i] = readPositiveDouble(scanner, "Salary: ");
            yearsOfService[i] = readPositiveDouble(scanner, "Years of service: ");
        }

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Calculate bonus and new salary
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double rate = (yearsOfService[i] > 5) ? HIGH_BONUS_RATE : LOW_BONUS_RATE;
            bonuses[i] = salaries[i] * rate;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\n--- Bonus Details ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotal old salary payout : " + String.format("%.2f", totalOldSalary));
        System.out.println("Total bonus payout      : " + String.format("%.2f", totalBonus));
        System.out.println("Total new salary payout : " + String.format("%.2f", totalNewSalary));

        scanner.close();
    }

    /**
     * Utility method to read a positive double value from the console.
     * If the user enters an invalid number, they are prompted again.
     */
    private static double readPositiveDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                }
            } else {
                scanner.next(); // consume invalid token
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }
    }
}
