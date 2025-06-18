// NumberCheckerAdvanced.java
// Utility class for perfect, abundant, deficient, strong numbers
public class NumberCheckerAdvanced {
    // Check if a number is perfect
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n && n > 0;
    }
    // Check if a number is abundant
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }
    // Check if a number is deficient
    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }
    // Check if a number is strong
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }
    private static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};
        for (int n : testNumbers) {
            System.out.println("Number: " + n);
            System.out.println("  Perfect: " + isPerfect(n));
            System.out.println("  Abundant: " + isAbundant(n));
            System.out.println("  Deficient: " + isDeficient(n));
            System.out.println("  Strong: " + isStrong(n));
        }
    }
}
