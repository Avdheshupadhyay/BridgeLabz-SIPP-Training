//This class calculates Sam's average marks in Physics, Chemistry, and Maths.
public class SamAverageMarks {
    public static void main(String[] args) {
        // Given marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        // Calculate average
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;
        
        // Output the result
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}