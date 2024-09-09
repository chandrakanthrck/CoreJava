package threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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

