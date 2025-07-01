// S5. Mark Superclass Methods final if Needed
class Parent {
    public final void criticalMethod() {
        System.out.println("Critical logic");
    }
}
class Child extends Parent {
    // Cannot override criticalMethod()
}
public class S5_FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.criticalMethod();
    }
}
