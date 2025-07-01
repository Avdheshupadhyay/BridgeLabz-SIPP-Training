// S13. Be Cautious with Constructors
class ParentCC {
    ParentCC() { System.out.println("Parent constructor"); }
}
class ChildCC extends ParentCC {
    ChildCC() {
        super(); // Explicit call
        System.out.println("Child constructor");
    }
}
public class S13_ConstructorCaution {
    public static void main(String[] args) {
        new ChildCC();
    }
}
