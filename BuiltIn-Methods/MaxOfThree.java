package BuildInFunction;

import java.util.Scanner;

public class MaxOfThree {
    static int getInput(Scanner sc, String label) {
        System.out.print("Enter " + label + " number: ");
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getInput(sc, "first");
        int b = getInput(sc, "second");
        int c = getInput(sc, "third");

        System.out.println("Maximum is: " + findMax(a, b, c));
    }
}
