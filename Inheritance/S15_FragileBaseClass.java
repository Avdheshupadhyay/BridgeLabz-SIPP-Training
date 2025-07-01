// S15. Beware of Fragile Base Class Problem
// Minimize changes to superclasses; use composition/abstraction for stability
class BaseFBC {
    void doWork() { System.out.println("Base work"); }
}
class SubFBC extends BaseFBC {
    @Override
    void doWork() { System.out.println("Sub work"); }
}
public class S15_FragileBaseClass {
    public static void main(String[] args) {
        BaseFBC b = new SubFBC();
        b.doWork();
    }
}
