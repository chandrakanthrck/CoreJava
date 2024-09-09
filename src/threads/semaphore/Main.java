package threads.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static threads.semaphore.SemaphoreExample.prepareDish;

public class Main {
    public static void main(String[] args) {
        // Create a thread pool to simulate multiple chefs working concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit chef tasks to the thread pool
        executorService.submit(() -> prepareDish("Chef 1"));
        executorService.submit(() -> prepareDish("Chef 2"));
        executorService.submit(() -> prepareDish("Chef 3"));
        executorService.submit(() -> prepareDish("Chef 4"));
        executorService.submit(() -> prepareDish("Chef 5"));

        // Shutdown the thread pool after tasks are done
        executorService.shutdown();
    }
}
