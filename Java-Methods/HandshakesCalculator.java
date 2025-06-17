import java.util.Scanner;
/**
 * HandshakesCalculator.java
 * Calculates the maximum number of handshakes among students.
 */
public class HandshakesCalculator {
    public static int calculateHandshakes(int numberOfStudents) {
        // Combination formula: nC2 = n*(n-1)/2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        // call the method
        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes: " + handshakes);
        sc.close();
    }
}
