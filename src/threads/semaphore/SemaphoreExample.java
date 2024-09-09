package threads.semaphore;

import java.util.concurrent.Semaphore;

/**
 * SemaphoreExample demonstrates the usage of Semaphore to control access to a limited resource.
 *
 * Restaurant Analogy:
 * In this restaurant, there are only 2 stoves, and the chefs need to wait for an available stove to start cooking.
 * The semaphore controls how many chefs (threads) can use the stoves at the same time.
 *
 * Use Case:
 * When you have a limited number of resources (e.g., stoves) and multiple tasks (chefs) that need to use them,
 * Semaphore helps manage access, ensuring that only a fixed number of threads can access the resource at the same time.
 */
public class SemaphoreExample {
    // Semaphore with 2 permits (e.g., only 2 stoves available)
    private static final Semaphore stoveSemaphore = new Semaphore(2);

    // Simulate a chef preparing a dish
    public static void prepareDish(String chefName) {
        try {
            // Chef tries to acquire a stove (permit)
            System.out.println(chefName + " is waiting for a stove...");
            stoveSemaphore.acquire(); // Acquires a permit (blocks if none available)

            // Chef is cooking
            System.out.println(chefName + " is cooking using a stove...");
            Thread.sleep(2000); // Simulate time taken to cook

            System.out.println(chefName + " has finished cooking and is releasing the stove.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release the stove (permit)
            stoveSemaphore.release();
        }
    }
}
