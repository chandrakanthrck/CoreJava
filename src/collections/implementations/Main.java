package collections.implementations;

public class Main {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        //output is 3:C 3:B 1:A
        cache.displayCache();

        cache.get(1);
        // output is 1:A 3:C 2:B
        cache.displayCache();

        cache.put(4, "D");
        // output: 4:D 1:A 3:C  (Key 2 was evicted)
        cache.displayCache();

        cache.put(5, "E");
        // Output: 5:E 4:D 1:A  (Key 3 was evicted)
        cache.displayCache();
    }
}
