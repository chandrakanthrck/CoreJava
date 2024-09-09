package threads.synchronizd;

/**
 * Synchronized is used to ensure that only one thread can access a block of code or a method at a time, preventing race conditions.
 *
 * Use Case: When multiple threads need to access shared resources, and you want to ensure thread safety by preventing concurrent access.
 * Example: Managing shared resources like counters, data structures, or I/O operations across multiple threads.
 */

public class Chef extends Thread{
    private DishCounter counter;
    private String dishName;

    Chef(DishCounter counter, String dishName){
        this.counter = counter;
        this.dishName = dishName;
    }

    @Override
    public void run(){
        System.out.println(dishName + " is being prepared by " + Thread.currentThread().getName());
        try{
            Thread.sleep((int)(Math.random()* 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter.increment();
        System.out.println(dishName + " is completed by " + Thread.currentThread().getName());
    }
}
