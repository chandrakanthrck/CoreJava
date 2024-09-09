package threads.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

class Restaurant {
    // Shared resource: The special ingredient storage room
    private static final ReentrantLock storageRoomLock = new ReentrantLock();

    // Each chef (thread) needs to access this storage room at some point
    public static void accessStorageRoom(String chefName) {
        System.out.println(chefName + " wants to access the storage room.");

        // Attempt to acquire the lock
        storageRoomLock.lock();  // Lock the storage room
        try {
            System.out.println(chefName + " has entered the storage room.");
            // Simulate time spent inside the storage room (getting ingredients)
            Thread.sleep(1000);
            System.out.println(chefName + " has finished using the storage room.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Always unlock the storage room when done
            storageRoomLock.unlock();
        }
    }
}
