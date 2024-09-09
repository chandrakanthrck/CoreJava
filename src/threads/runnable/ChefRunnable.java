package threads.runnable;

/**
 * Runnable represents a task that can be run in a thread but doesn't return a result or throw exceptions.
 *
 * Use Case: When you need to perform a task in a separate thread but don’t need to return any result.
 * Example: Running background jobs like logging, periodic updates, or notifications that don't require returning data.
 */

public class ChefRunnable implements Runnable {
    @Override
    public void run() {
        try{
        System.out.println("Chef is preparing the dish");
            // Simulate time taken to cook the dish
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Chef was interrupted while cooking.");
        }
    }
}