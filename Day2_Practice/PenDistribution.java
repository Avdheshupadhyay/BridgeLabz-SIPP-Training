//This class calculates how many pens each student gets when divided equally and finds the remainder.
public class PenDistribution {
    public static void main(String[] args) {
        // Given data
        int totalPens = 14;
        int numberOfStudents = 3;
        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                         " and the remaining pen not distributed is " + remainingPens);
    }
}