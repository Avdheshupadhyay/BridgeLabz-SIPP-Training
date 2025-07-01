// S12. Avoid Overriding Methods Unnecessarily
class ParentAUO {
    void greet() { System.out.println("Hello from parent"); }
}
class ChildAUO extends ParentAUO {
    // Don't override greet() unless behavior changes
}
public class S12_AvoidUnnecessaryOverride {
    public static void main(String[] args) {
        ChildAUO c = new ChildAUO();
        c.greet();
    }
}
