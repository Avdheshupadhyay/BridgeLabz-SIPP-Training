// S2. Ensure Proper Use of is-a Relationship
// Dog extends Animal is correct (Dog is an Animal)
class Animal {
    void makeSound() { System.out.println("Some animal sound"); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Woof!"); }
}
public class S2_IsARelationship {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}
