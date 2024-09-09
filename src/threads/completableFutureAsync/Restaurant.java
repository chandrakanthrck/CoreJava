package threads.completableFutureAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * CompletableFuture allows you to run tasks asynchronously and chain them together without blocking.
 *
 * Use Case: When you need to run multiple tasks in parallel or sequentially, handle their results asynchronously, and avoid blocking the main thread.
 * Example: Making multiple non-blocking API calls in parallel and combining their results once all are done.
 */

public class Restaurant {
    // Asynchronous task: Chef prepares the dish
    public static CompletableFuture<String> prepareDish() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Chef is preparing the dish...");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Dish is ready";
        });
    }

    public static CompletableFuture<String> serveDish(String dish) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Waiter is collecting and serving the dish...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return dish + " is served";
        });
    }

    public static CompletableFuture<Void> notifyCustomer(String message) {
        return CompletableFuture.runAsync(() -> {
            System.out.println("Customer is being notified....");
            System.out.println("Notification: " + message);
        });
    }
}
