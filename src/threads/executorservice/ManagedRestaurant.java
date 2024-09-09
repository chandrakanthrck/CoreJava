package threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExecutorService provides a pool of threads to manage task execution concurrently, making thread management easier.
 *
 * Use Case: When you need to manage multiple threads efficiently, schedule tasks, and control the life cycle of threads.
 * Example: Running multiple independent tasks concurrently, such as handling multiple user requests in a web application.
 */

//managing the threads properly by fixating the number of chefs by using executorservice
public class ManagedRestaurant {
    public static void main(String[] args) {

        ExecutorService chefPool = Executors.newFixedThreadPool(3);
            for (int i = 0; i <= 10; i++) {
                final int dishNumber = i;
                chefPool.execute(() -> {
                    System.out.println(dishNumber + " being prepared by " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(dishNumber + " is completed by " + Thread.currentThread().getName());
                });
            }chefPool.shutdown();
    }
}

