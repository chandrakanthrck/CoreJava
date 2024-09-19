package collections.implementations;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache<K,V> {
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        this.keyNodeMap = new HashMap<>();
        this.freqListMap = new HashMap<>();
    }

    public class Node{
        K key;
        V value;
        int frequency;
        Node(K key, V value){
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }
    private final int capacity;
    private int minFrequency;
    private final HashMap<K, Node> keyNodeMap;
    private final HashMap<Integer, LinkedHashSet<Node>> freqListMap;
    private void updateFrequency(Node node){
        int currentFreq = node.frequency;
        LinkedHashSet<Node> nodes = freqListMap.get(currentFreq);
        nodes.remove(node);
        if(nodes.isEmpty() && currentFreq == minFrequency){
            minFrequency++;
        }
        node.frequency++;
        freqListMap.computeIfAbsent(node.frequency, k -> new LinkedHashSet<>()).add(node);
    }
    public V get(K key){
        if(!keyNodeMap.containsKey(key)){
            return null;
        }
        Node node = keyNodeMap.get(key);
        updateFrequency(node);
        return  node.value;
    }
    public void put(K key, V value){
        if(capacity <= 0){
            //do nothing
            return;
        }
        if(keyNodeMap.containsKey(key)){
            Node node = keyNodeMap.get(key);
            node.value = value;
            updateFrequency(node);
        }else{
            // If adding a new key and the cache is full, remove the least frequently used item
            if(keyNodeMap.size() >= capacity){
                // Get the least frequently used nodes
                LinkedHashSet<Node> minFreqNodes = freqListMap.get(minFrequency);
                // Get the least recently used node
                Node lfuNode = minFreqNodes.iterator().next();
                minFreqNodes.remove(lfuNode);
                keyNodeMap.remove(lfuNode.key);
            }
            // Add the new node to the cache
            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            minFrequency = 1;
            freqListMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
        }
    }
}
