package threads.reentrantlock;

public class RestaurantWithLock {
    public static void main(String[] args) {
        // Create 3 chef threads
        Chef chef1 = new Chef("Chef 1");
        Chef chef2 = new Chef("Chef 2");
        Chef chef3 = new Chef("Chef 3");

        // Start all chefs (threads) at the same time
        chef1.start();
        chef2.start();
        chef3.start();
    }
}
