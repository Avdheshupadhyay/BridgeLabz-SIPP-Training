// Q10: Demonstrate NullPointerException
public class NullPointerExceptionDemo {
    // Method to generate NullPointerException (unhandled)
    static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException using try-catch
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // 1. Call method to generate exception (unhandled, will stop program)
        // Uncomment below line to see abrupt stop
        // generateException();
        // 2. Call method to handle exception
        handleException();
    }
}
