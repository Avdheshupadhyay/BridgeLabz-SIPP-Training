import java.util.Scanner;

/**
 * Program to take user input for the age of all 10 students in a class and check whether the student can vote (age >= 18).
 */
public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        scanner.close();
    }
}
