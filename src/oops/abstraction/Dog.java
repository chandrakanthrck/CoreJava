package oops.abstraction;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}