// import the package
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.println("Enter the number of students:");
        int number = sc.nextInt();

        // Create a 2D array to store Maths, Physics, Chemistry marks of students
        int[][] result = new int[number][3];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Maths";
                else if (j == 1) subject = "Physics";
                else subject = "Chemistry";

                while (true) {
                    System.out.println("Enter the " + subject + " Marks of Student " + (i + 1) + ":");
                    int n = sc.nextInt();

                    if (n < 0) {
                        System.out.println("Invalid input! Marks can't be negative. Please enter again.");
                        continue; // ask again for same subject
                    }

                    result[i][j] = n;
                    break;
                }
            }
        }

        // Initialize arrays to store percentage and grade of each student
        int[] percentage = new int[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += result[i][j];
            }

            int percent = (int) (((double) sum / 300) * 100);
            percentage[i] = percent;

            // Assign grade based on percentage
            if (percent >= 80) grade[i] = 'A';
            else if (percent >= 70) grade[i] = 'B';
            else if (percent >= 60) grade[i] = 'C';
            else if (percent >= 50) grade[i] = 'D';
            else if (percent >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Display each student's results
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + " Result:");
            System.out.println("Maths Marks     = " + result[i][0]);
            System.out.println("Physics Marks   = " + result[i][1]);
            System.out.println("Chemistry Marks = " + result[i][2]);
            System.out.println("Percentage      = " + percentage[i] + "%");
            System.out.println("Grade           = " + grade[i]);
        }

        sc.close();
    }
}
