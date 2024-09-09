package threads;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private final Semaphore semaphore = new Semaphore(2);  // Allow up to 2 threads

    public void accessResource() throws InterruptedException {
        semaphore.acquire();
        try {
            System.out.println("Resource accessed by: " + Thread.currentThread().getId());
            Thread.sleep(2000);
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        SemaphoreExample example = new SemaphoreExample();

        Runnable task = () -> {
            try {
                example.accessResource();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
