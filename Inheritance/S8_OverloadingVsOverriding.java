// S8. Avoid Overloading alongside Overriding
class AnimalOVO {
    void makeSound() { System.out.println("Animal sound"); }
}
class DogOVO extends AnimalOVO {
    @Override
    void makeSound() { System.out.println("Woof"); }
    // Avoid: void makeSound(String type) {...} (overloading) if not needed
}
public class S8_OverloadingVsOverriding {
    public static void main(String[] args) {
        AnimalOVO a = new DogOVO();
        a.makeSound();
    }
}
