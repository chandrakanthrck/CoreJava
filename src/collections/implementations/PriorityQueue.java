package collections.implementations;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static java.util.Collections.swap;

public class PriorityQueue<T> {
    private class Node {
        T data;
        int priority;

        Node(T data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private ArrayList<Node> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(T data, int priority) {
        Node newNode = new Node(data, priority);
        heap.add(newNode);
        heapifyUp(heap.size() - 1);
    }

    public T dequeue() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        T result = heap.get(0).data;
        //heap.remove(heap.size()-1 removes the last item in the heap and returns it
        heap.set(0, heap.remove(heap.size() - 1));
        if (!heap.isEmpty()) {
            heapifyDown(0);
        }
        return result;
    }

    public T peek() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return heap.get(0).data;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).priority < heap.get(parentIndex).priority) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        // Continue to move the element down until the heap property is satisfied
        while (index < heap.size()) {
            int leftChildIndex = 2 * index + 1;   // Get the left child's index
            int rightChildIndex = 2 * index + 2;  // Get the right child's index
            int smallest = index;                 // Assume the current element is the smallest

            // Check if the left child has a higher priority (smaller priority number)
            if (leftChildIndex < heap.size() && heap.get(leftChildIndex).priority < heap.get(smallest).priority) {
                smallest = leftChildIndex;
            }

            // Check if the right child has a higher priority (smaller priority number)
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(smallest).priority) {
                smallest = rightChildIndex;
            }

            // If the current element is smaller than its children, stop
            if (smallest != index) {
                swap(index, smallest);  // Swap the current element with the smallest child
                index = smallest;       // Move down to the smallest child's index
            } else {
                break;  // Heap property is satisfied, break the loop
            }
        }
    }


    private void swap(int i, int j) {
        Node temp = heap.get(i);  // Store the first element temporarily
        heap.set(i, heap.get(j)); // Replace the first element with the second
        heap.set(j, temp);

    }
}