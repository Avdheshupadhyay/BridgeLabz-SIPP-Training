// S14. Use Polymorphism Effectively
class AnimalPoly {
    void makeSound() { System.out.println("Animal sound"); }
}
class DogPoly extends AnimalPoly {
    @Override
    void makeSound() { System.out.println("Woof"); }
}
public class S14_Polymorphism {
    public static void main(String[] args) {
        AnimalPoly a = new DogPoly();
        a.makeSound(); // Polymorphism in action
    }
}
