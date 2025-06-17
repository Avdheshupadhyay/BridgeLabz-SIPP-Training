import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [][0]=height, [][1]=weight, [][2]=BMI
        String[] weightStatus = new String[number];

        // 2. Input height and weight, validate positive values
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            double height;
            do {
                System.out.print("  Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("  Height must be positive.");
            } while (height <= 0);

            double weight;
            do {
                System.out.print("  Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("  Weight must be positive.");
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;

            // 3. Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal weight";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // 4. Display results
        System.out.println("\nHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}