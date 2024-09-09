package threads.completableFutureAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static threads.completableFutureAsync.Restaurant.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Step 1: Chef prepares the dish
        CompletableFuture<String> preparedDishFuture = prepareDish();

        // Step 2: Chain the serveDish task after preparation is complete
        CompletableFuture<String> servedDishFuture = preparedDishFuture.thenCompose(dish -> serveDish(dish));

        // Step 3: Chain the notifyCustomer task after the dish is served
        CompletableFuture<Void> notificationFuture = servedDishFuture.thenCompose(dishMessage -> notifyCustomer(dishMessage));

        // Step 4: Wait for all tasks to complete
        notificationFuture.get(); // Blocking call to wait for all asynchronous tasks to complete
        System.out.println("All tasks are done.");
    }
}
