package threads.threads;

public class Main {
    public static void main(String[] args) {
        // Creating multiple chef threads
        ThreadExample chef1 = new ThreadExample("Chef 1");
        ThreadExample chef2 = new ThreadExample("Chef 2");
        ThreadExample chef3 = new ThreadExample("Chef 3");

        // Starting the chef threads to execute their tasks concurrently
        chef1.start();
        chef2.start();
        chef3.start();

        // Main thread waits for chefs to finish
        try {
            chef1.join();
            chef2.join();
            chef3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All chefs have finished their tasks!");
    }
}
