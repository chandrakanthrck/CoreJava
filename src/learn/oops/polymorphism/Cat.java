package src.learn.oops.polymorphism;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound();
    }
}
