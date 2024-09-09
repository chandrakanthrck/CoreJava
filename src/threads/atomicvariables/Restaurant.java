package threads.atomicvariables;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
In a restaurant, we want to keep track of how many dishes have been prepared by the chefs.
Multiple chefs (threads) are working in parallel, and they all increment the count each time a dish is prepared.
To avoid race conditions (where multiple chefs try to update the count at the same time,
leading to incorrect counts), we use an atomic variable.
Atomic Variables like AtomicInteger are essential in multithreaded environments to perform atomic operations
(e.g., incrementing a counter) without the need for explicit locks or synchronization.
 */
public class Restaurant {

    // AtomicInteger to keep track of how many dishes are prepared
    private AtomicInteger dishCount = new AtomicInteger(0);

    // Simulating a chef preparing a dish
    public void prepareDish(String chefName) {
        System.out.println(chefName + " is preparing the dish on Thread: " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(1);  // Simulate time taken to prepare the dish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Increment the dish count atomically
        int count = dishCount.incrementAndGet();  // Atomic increment
        System.out.println(chefName + " has completed a dish. Total dishes prepared: " + count);
    }
    // Getter to safely access dishCount
    public int getDishCount() {
        return dishCount.get();
    }
}
