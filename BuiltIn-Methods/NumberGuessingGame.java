package BuildInFunction;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static int getGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    static String getFeedback(Scanner sc, int guess) {
        System.out.print("Is the number " + guess + "? (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String response;
        int guess;

        System.out.println("Think of a number between 1 and 100...");

        while (true) {
            guess = getGuess(low, high);
            response = getFeedback(sc, guess);

            if (response.equals("correct")) {
                System.out.println("Yay! Guessed it right!");
                break;
            } else if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            }
        }
    }
}

