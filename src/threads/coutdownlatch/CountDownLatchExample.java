package threads.coutdownlatch;

import java.util.concurrent.CountDownLatch;


/**
 * CountDownLatchExample demonstrates the usage of CountDownLatch to synchronize multiple threads.
 *
 * Restaurant Analogy:
 * The restaurant cannot open until all the chefs have completed their ingredient preparation.
 * The main thread (restaurant opening) waits for the chefs (threads) to finish their tasks before proceeding.
 *
 * Use Case:
 * When you want multiple threads (chefs) to complete their tasks before allowing the main thread
 * to proceed, CountDownLatch ensures that all threads finish before the main thread continues.
 */
public class CountDownLatchExample {
    // CountDownLatch initialized with a count of 3 (e.g., 3 chefs preparing ingredients)
    private static final CountDownLatch latch = new CountDownLatch(3);

    // Simulating chef's preparation
    public static void chefPreparation(String chefName) {
        try {
            System.out.println(chefName + " is preparing ingredients...");
            Thread.sleep(2000); // Simulate time taken for preparation
            System.out.println(chefName + " has finished preparing ingredients.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Count down when the chef finishes preparation
            latch.countDown();
        }
    }

    // Public method to wait for all chefs to complete their tasks
    public static void awaitCompletion() throws InterruptedException {
        latch.await();  // Waits until the latch count reaches 0
    }
}
