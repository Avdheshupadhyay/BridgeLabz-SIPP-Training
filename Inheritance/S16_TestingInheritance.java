// S16. Test Subclass and Superclass Interactions
class SuperTI {
    int getValue() { return 42; }
}
class SubTI extends SuperTI {
    @Override
    int getValue() { return 100; }
}
public class S16_TestingInheritance {
    public static void main(String[] args) {
        SuperTI s = new SubTI();
        System.out.println(s.getValue()); // Should print 100
    }
}
