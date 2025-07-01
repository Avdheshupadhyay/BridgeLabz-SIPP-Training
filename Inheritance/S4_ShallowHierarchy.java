// S4. Avoid Deep Inheritance Hierarchies
// Keep hierarchies shallow (2-3 levels)
class A {}
class B extends A {}
class C extends B {} // Avoid going deeper
public class S4_ShallowHierarchy {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("Instance of C created (shallow hierarchy).");
    }
}
