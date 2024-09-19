package collections.implementations;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing LRU Cache:");
        testLRUCache();

        System.out.println("\nTesting LFU Cache:");
        testLFUCache();
    }

    private static void testLRUCache() {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // The cache now contains {1=One, 2=Two, 3=Three}
        System.out.println(cache.get(2)); // Access key 2 -> Output: "Two", {1=One, 3=Three, 2=Two}

        cache.put(4, "Four"); // Adding a new item (4, "Four") will evict the least recently used (key 1)
        // The cache now contains {3=Three, 2=Two, 4=Four}
        System.out.println(cache.get(1)); // Trying to access evicted key 1 -> Output: null

        cache.put(5, "Five"); // Adding a new item (5, "Five") will evict the least recently used (key 3)
        // The cache now contains {2=Two, 4=Four, 5=Five}
        System.out.println(cache.get(3)); // Trying to access evicted key 3 -> Output: null

        System.out.println(cache.get(2)); // Access key 2 -> Output: "Two"
    }

    private static void testLFUCache() {
        LFUCache<Integer, String> cache = new LFUCache<>(3); // Create an LFU cache with a capacity of 3
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // The cache now contains {1=One, 2=Two, 3=Three} with frequencies of 1 each
        System.out.println(cache.get(1)); // Access key 1 -> Output: "One"
        // Now key 1 has a frequency of 2

        cache.put(4, "Four"); // Adding a new item (4, "Four") will evict key 2 (least frequently used)
        // The cache now contains {1=One (freq: 2), 3=Three (freq: 1), 4=Four (freq: 1)}
        System.out.println(cache.get(2)); // Trying to access evicted key 2 -> Output: null

        cache.put(5, "Five"); // Adding a new item (5, "Five") will evict key 3 (least frequently used)
        // The cache now contains {1=One (freq: 2), 4=Four (freq: 1), 5=Five (freq: 1)}
        System.out.println(cache.get(3)); // Trying to access evicted key 3 -> Output: null
        System.out.println(cache.get(1)); // Access key 1 -> Output: "One"
        System.out.println(cache.get(4)); // Access key 4 -> Output: "Four"
    }
}
