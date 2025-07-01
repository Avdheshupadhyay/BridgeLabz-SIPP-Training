// S6. Use @Override Annotation
class AnimalOA {
    void makeSound() { System.out.println("Animal sound"); }
}
class CatOA extends AnimalOA {
    @Override
    void makeSound() { System.out.println("Meow"); }
}
public class S6_OverrideAnnotation {
    public static void main(String[] args) {
        AnimalOA a = new CatOA();
        a.makeSound();
    }
}
