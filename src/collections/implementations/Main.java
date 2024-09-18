package collections.implementations;

public class Main {
    public static void main(String[] args) {
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
}
