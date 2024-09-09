package threads.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock is a more flexible alternative to the synchronized keyword, providing explicit locking with features like fairness, tryLock, etc.
 *
 * Use Case: When you need finer control over locking mechanisms, such as trying to acquire a lock with timeout or handling deadlock scenarios.
 * Example: Ensuring only one thread accesses a critical section in a complex multi-threaded environment while allowing more flexibility.
 */

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
