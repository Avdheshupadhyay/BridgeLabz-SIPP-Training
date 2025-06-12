//This class calculates Harry's age in 2024 given his birth year.
public class HarryAgeCalculator {
    public static void main(String[] args) {
        // Given data
        int yearOfBirth = 2000;
        int currentYear = 2024;
        
        // Calculate age
        int age = currentYear - yearOfBirth;
        
        // Output the result
        System.out.println("Harry's age in 2024 is " + age);
    }
}