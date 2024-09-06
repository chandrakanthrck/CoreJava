package oops.abstraction;

public class AbstractExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls Dog's sound method
        dog.sleep(); // Calls Animal's sleep method
    }
}
