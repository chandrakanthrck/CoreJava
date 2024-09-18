package collections.implementations;

import java.util.HashMap;

//complexity is (O(1)) keeping track of the access order for eviction when cache exceeds its size
public class LRUCache<K, V> {
    //this constructor allows user to provide a specific HashMap when creating an instance of LRUCache.
    //here the map param is assigned to the cahce's internal map field, giving user flexibility in managing
    //the underlying storage of the cache
    public LRUCache(int capacity, HashMap<K, Node> map) {
        this.capacity = capacity;
        this.map = map;
    }

    class Node{
        K key;
        V value;
        Node prev;
        Node next;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    //capcity of the cache
    private final int capacity;
    //hashmap to quick access to cache items
    private final HashMap<K, Node> map;
    //head and tail to keep a track of doubly linked list
    private Node head, tail;
    //this constructor is the more typical use case. It initializes the LRUCache with a fixed capacity and
    //creates a new empty hashmap to manage the cache's items internally.
    public LRUCache(int capacity){
        //set cache size
        this.capacity = capacity;
        //initialize hashmap to store key-node mappings
        this.map = new HashMap<>();
    }

    private void addNode(Node node){
        if(tail != null){
            //point the current tail's 'next' to the new node
            tail.next = node;
            node.prev = tail;
            node.next = null;
        }else{
            head = tail = node;
        }
    }
    private void removeNode(Node node){
        if(node.prev!=null){
            // bypass 'node' by linking previous node to 'node's next
            node.prev.next = node.next;
        }else{
            //update tail to be the previous node if node is the tail
            head = node.next;
        }
    }
    private void moveTail(Node node){
        // first, remove it from its current position
        removeNode(node);
        // then, add it to the end of the list
        addNode(node);
    }
    // Method to get the value associated with a key in the cache
    public V get(K key){
        if(!map.containsKey(key)){
            return null;
        }
        Node node = map.get(key);
        // mark this node as most recently used
        moveTail(node);
        return node.value;
    }

    public void put(K key, V value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            moveTail(node);
        }else{
            Node newNode = new Node(key, value);
            if(map.size() >= capacity){
                map.remove(head.key);
                removeNode(head);
            }
            addNode(newNode);
            map.put(key, newNode);
        }
    }

}
