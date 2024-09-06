package src.learn.oops.polymorphism;

public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum (int): " + obj.add(2, 3));
        System.out.println("Sum (double): " + obj.add(2.5, 3.5));
    }
}