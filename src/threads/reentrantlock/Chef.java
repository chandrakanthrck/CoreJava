package threads.reentrantlock;

public class Chef extends Thread {
    private String chefName;

    public Chef(String chefName) {
        this.chefName = chefName;
    }

    @Override
    public void run() {
        System.out.println(chefName + " is preparing a dish.");
        try {
            Thread.sleep(500);  // Simulate time spent preparing the dish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Restaurant.accessStorageRoom(chefName);  // Chef needs access to the storage room
    }
}
