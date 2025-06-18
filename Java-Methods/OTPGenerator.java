// OTPGenerator.java
// Program to generate unique 6-digit OTPs 10 times
import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }
    // Method to ensure uniqueness of OTPs
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.print("Generated OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println();
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
