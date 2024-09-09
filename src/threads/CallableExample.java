package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 123;
        };

        Future<Integer> future = executor.submit(task);
        Integer result = future.get();  // This blocks until the result is available

        System.out.println("Result from Callable: " + result);

        executor.shutdown();
    }
}
