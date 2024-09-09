package threads.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        // Create an executor service to manage threads
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit the callable task to the executor
        Future<String> futureResult = executor.submit(new ChefCallable());
        try{
            // This will block until the callable task is completed
            String result = futureResult.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            System.err.println("Error occurred while waiting for the chef: " + e.getMessage());
        } finally {
            // Properly shut down the executor service
            executor.shutdown();
        }
        System.out.println("Main thread continue after Callable completes.");
    }
}
