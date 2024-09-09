package threads.atomicvariables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a restaurant instance
        Restaurant restaurant = new Restaurant();

        // Create a thread pool to simulate multiple chefs working concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit chef tasks to the thread pool
        executorService.submit(() -> restaurant.prepareDish("Chef 1"));
        executorService.submit(() -> restaurant.prepareDish("Chef 2"));
        executorService.submit(() -> restaurant.prepareDish("Chef 3"));
        executorService.submit(() -> restaurant.prepareDish("Chef 4"));
        executorService.submit(() -> restaurant.prepareDish("Chef 5"));

        // Shut down the executor service after tasks are done
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        // Print final dish count
        System.out.println("Restaurant is closing. Final dish count: " + restaurant.getDishCount());
    }
}