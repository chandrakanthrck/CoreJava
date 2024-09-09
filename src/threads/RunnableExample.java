package threads;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        Thread thread2 = new Thread(new RunnableExample());

        thread1.start();
        thread2.start();
    }
}
