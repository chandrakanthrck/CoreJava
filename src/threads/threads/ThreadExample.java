package threads.threads;

/**
 * ThreadExample demonstrates the basic concept of creating and running threads in Java.
 *
 * Restaurant Analogy:
 * Each chef represents a separate thread, and they all work in parallel to prepare their dishes.
 * Extending the Thread class allows us to define individual tasks for each chef (thread).
 *
 * Use Case:
 * This is useful when you want multiple tasks (chefs) to run concurrently but independently of each other.
 * For example, Chef 1, Chef 2, and Chef 3 can all prepare their dishes at the same time without waiting for each other.
 */
public class ThreadExample extends Thread {

    private String chefName;

    // Constructor to assign the chef name to the thread
    public ThreadExample(String chefName) {
        this.chefName = chefName;
    }

    // Overriding the run method to simulate the work done by the thread
    @Override
    public void run() {
        System.out.println(chefName + " is preparing the dish... on Thread: " + Thread.currentThread().getName());
        try {
            // Simulating time taken to prepare the dish
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(chefName + " has finished preparing the dish!");
    }
}
