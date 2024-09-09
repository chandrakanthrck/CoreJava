package threads.coutdownlatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static threads.coutdownlatch.CountDownLatchExample.chefPreparation;

public class Main {
    // Main method to demonstrate the usage of CountDownLatch
    public static void main(String[] args) throws InterruptedException {
        // Create a thread pool to simulate multiple chefs working concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit chef preparation tasks to the thread pool
        executorService.submit(() -> chefPreparation("Chef 1"));
        executorService.submit(() -> chefPreparation("Chef 2"));
        executorService.submit(() -> chefPreparation("Chef 3"));

        // Wait for all chefs to finish their preparation before opening the restaurant
        System.out.println("Waiting for all chefs to finish preparation...");
        CountDownLatchExample.awaitCompletion();  // Main thread waits here until latch count reaches 0
        System.out.println("All chefs are ready. The restaurant is now open!");

        // Shut down the thread pool after tasks are done
        executorService.shutdown();
    }
}
