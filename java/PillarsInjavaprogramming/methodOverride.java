package PillarsInjavaprogramming;
// Main class
public class methodOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.details(); // Will call Animal's details() method
        Animal dog = new Dog(); // Upcasting
        dog.details(); // Will call Dog's overridden details() method
        Animal cat = new Cat(); // Upcasting
        cat.details(); // Will call Cat's overridden details() method
    }
}
// Base class
class Animal {
    public void details() {
    System.out.println("This is an animal.");
    }
}
// Subclass 1
class Dog extends Animal {
    @Override
    public void details() {
    System.out.println("This is a dog.");
    }
}
// Subclass 2
class Cat extends Animal {
    @Override
    public void details() {
    System.out.println("This is a cat.");
    }
}