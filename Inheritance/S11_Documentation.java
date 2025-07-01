// S11. Document Inheritance Behavior
// Javadoc example:
/**
 * Animal base class. Subclasses should override makeSound() to provide specific sounds.
 */
class AnimalDoc {
    /**
     * Makes a sound. Override in subclasses.
     */
    void makeSound() { System.out.println("Some animal sound"); }
}
class CatDoc extends AnimalDoc {
    @Override
    void makeSound() { System.out.println("Meow"); }
}
public class S11_Documentation {
    public static void main(String[] args) {
        AnimalDoc a = new CatDoc();
        a.makeSound();
    }
}
