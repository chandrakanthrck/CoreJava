package collections.implementations;

import java.util.HashMap;

public class LRUCache<K, V> {
    private final int capacity;
    private final HashMap<K, Node<K, V>> cache;
    private Node<K, V> head, tail;

    // Constructor to initialize LRU Cache with a given capacity
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }

    // Get method to retrieve the value for a given key
    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null; // Key doesn't exist in cache
        }

        // Move the accessed node to the front (head)
        Node<K, V> node = cache.get(key);
        moveToHead(node);

        return node.value;
    }

    // Put method to add or update the value for a given key
    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            // If key exists, update the value and move it to the head
            Node<K, V> node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            // Create a new node
            Node<K, V> newNode = new Node<>(key, value);
            cache.put(key, newNode);
            addToHead(newNode);

            // If cache exceeds capacity, remove the least recently used (tail)
            if (cache.size() > capacity) {
                cache.remove(tail.key);
                removeTail();
            }
        }
    }

    // Helper method to move a node to the head of the list
    private void moveToHead(Node<K, V> node) {
        removeNode(node);
        addToHead(node);
    }

    // Helper method to remove a node from the list
    private void removeNode(Node<K, V> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next; // Node is the head
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev; // Node is the tail
        }
    }

    // Helper method to add a node to the head of the list
    private void addToHead(Node<K, V> node) {
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node; // If list was empty, set tail
        }
    }

    // Helper method to remove the tail (least recently used item)
    private void removeTail() {
        if (tail != null) {
            if (tail.prev != null) {
                tail.prev.next = null;
            } else {
                head = null; // List becomes empty
            }
            tail = tail.prev;
        }
    }

    // Method to display the cache for testing purposes
    public void displayCache() {
        Node<K, V> current = head;
        while (current != null) {
            System.out.print(current.key + ":" + current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
