// StudentVoteChecker.java
// Program to check if students can vote based on their age
import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) return false; // Invalid age
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i+1) + " (Age: " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i+1) + " (Age: " + ages[i] + ") cannot vote.");
            }
        }
        sc.close();
    }
}
