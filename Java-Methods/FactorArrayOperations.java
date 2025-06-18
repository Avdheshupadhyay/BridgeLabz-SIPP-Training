// FactorArrayOperations.java
// Utility class for factor array operations (find, greatest, sum, product, product of cubes)
import java.util.Arrays;

public class FactorArrayOperations {
    // Find factors of a number
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[idx++] = i;
        }
        return factors;
    }
    // Find the greatest factor (other than the number itself)
    public static int greatestFactor(int n) {
        int[] factors = getFactors(n);
        if (factors.length < 2) return -1;
        return factors[factors.length - 2];
    }
    // Find the sum of the factors
    public static int sumOfFactors(int n) {
        int[] factors = getFactors(n);
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    // Find the product of the factors
    public static long productOfFactors(int n) {
        int[] factors = getFactors(n);
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }
    // Find the product of the cubes of the factors
    public static long productOfCubesOfFactors(int n) {
        int[] factors = getFactors(n);
        long prod = 1;
        for (int f : factors) prod *= (long)Math.pow(f, 3);
        return prod;
    }
    public static void main(String[] args) {
        int n = 12; // Sample number
        System.out.println("Factors: " + Arrays.toString(getFactors(n)));
        System.out.println("Greatest factor: " + greatestFactor(n));
        System.out.println("Sum of factors: " + sumOfFactors(n));
        System.out.println("Product of factors: " + productOfFactors(n));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(n));
    }
}
