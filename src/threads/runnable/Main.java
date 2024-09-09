package threads.runnable;

public class Main {
    public static void main(String[] args) {
        // Create a new thread for the chef to run the task
        Thread chef = new Thread(new ChefRunnable());
        // Start the thread (chef starts cooking)
        chef.start();
        try{
            // Join ensures the main thread waits for the chef to finish
            chef.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted.");
        }
    }
}
