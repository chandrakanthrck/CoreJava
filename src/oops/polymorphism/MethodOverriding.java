package oops.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Animal sound

        Animal myCat = new Cat();
        myCat.sound();  // Cat's overridden sound method
    }
}