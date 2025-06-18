// NumberChecker.java
// Utility class for various number checks (prime, neon, spy, automorphic, buzz)
public class NumberChecker {
    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    // Check if a number is neon
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }
    // Check if a number is spy
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }
    // Check if a number is automorphic
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        String nStr = String.valueOf(n);
        String sqStr = String.valueOf(sq);
        return sqStr.endsWith(nStr);
    }
    // Check if a number is buzz
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    public static void main(String[] args) {
        int[] testNumbers = {2, 9, 22, 25, 27}; // Sample test numbers
        for (int n : testNumbers) {
            System.out.println("Number: " + n);
            System.out.println("  Prime: " + isPrime(n));
            System.out.println("  Neon: " + isNeon(n));
            System.out.println("  Spy: " + isSpy(n));
            System.out.println("  Automorphic: " + isAutomorphic(n));
            System.out.println("  Buzz: " + isBuzz(n));
        }
    }
}
