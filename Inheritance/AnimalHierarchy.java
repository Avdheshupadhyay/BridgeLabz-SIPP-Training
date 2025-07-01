// Animal Hierarchy: Demonstrates basic inheritance, method overriding, and polymorphism
class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " the Dog says: Woof!");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " the Cat says: Meow!");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " the Bird says: Tweet!");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Buddy", 3), new Cat("Whiskers", 2), new Bird("Tweety", 1)};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
