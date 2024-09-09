package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> System.out.println("Task 1 running: " + Thread.currentThread().getId());
        Runnable task2 = () -> System.out.println("Task 2 running: " + Thread.currentThread().getId());

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}
