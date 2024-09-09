# Multi-Threading Examples in Java

This repository contains various examples demonstrating multi-threading and concurrency in Java. Each file showcases different aspects of thread management and synchronization, providing practical insights into concurrent programming, using **restaurant-based analogies** to make the concepts easier to grasp.

## Files and Descriptions (with Restaurant Analogy)

- **`ChefCallable.java`**:  
  **Analogy**: A chef prepares a dish and informs you once it's ready, returning the result.  
  **Description**: Demonstrates the use of `Callable` and `Future` for tasks that return a result. It showcases how to submit tasks to an `ExecutorService` and retrieve results.

- **`CountDownLatchExample.java`**:  
  **Analogy**: The restaurant cannot open until all chefs have finished their prep work. Only when all prep work is done can the doors open.  
  **Description**: Shows how to use `CountDownLatch` to synchronize threads by making one or more threads wait until a set of operations being performed in other threads completes.

- **`ExecutorServiceExample.java`**:  
  **Analogy**: The restaurant has a pool of chefs. Each chef can handle a task, and once a chef finishes, they are ready for the next task, managed by the head chef.  
  **Description**: Provides examples of using `ExecutorService` for managing and controlling thread execution. It includes examples of creating a thread pool and handling tasks.

- **`Restaurant.java`**:  
  **Analogy**: A chef takes control of the stove, ensuring that no other chef can use it until they finish cooking. Once done, they release the stove for others to use.  
  **Description**: Illustrates the use of `ReentrantLock` for explicit locking and unlocking of critical sections, providing more advanced synchronization control compared to `synchronized` blocks.

- **`ChefRunnable.java`**:  
  **Analogy**: A chef starts preparing a dish but doesn’t report when it's done. The work is happening in the background, but there’s no result returned.  
  **Description**: Demonstrates the implementation of the `Runnable` interface for defining and running tasks in separate threads.

- **`SemaphoreExample.java`**:  
  **Analogy**: There are only a limited number of stoves in the kitchen. Only a few chefs can use them at the same time, and others must wait their turn.  
  **Description**: Shows how to use `Semaphore` to control access to a resource pool by multiple threads, managing permits for concurrent access.

- **`Chef.java`**:  
  **Analogy**: Only one chef can use the chopping board at a time. Once they finish, another chef can use it. This ensures that no two chefs use the same chopping board at the same time.  
  **Description**: Provides examples of using the `synchronized` keyword to achieve thread synchronization and prevent concurrent access to critical sections of code.

- **`ThreadExample.java`**:  
  **Analogy**: A new chef (thread) is hired to prepare a dish. You extend the basic kitchen staff to add a specialized chef to handle unique tasks.  
  **Description**: Illustrates the basics of creating and starting threads by extending the `Thread` class and overriding its `run` method.

- **`Main.java`**:  
  **Analogy**: The main dining area where all the cooking (multi-threading examples) takes place and is orchestrated.  
  **Description**: Contains the main method to run and demonstrate the various multi-threading examples included in the repository.

- **`.gitignore`**:  
  Specifies files and directories to be ignored by Git, such as compiled classes and IDE-specific files.

## Getting Started

To get started with these examples:

1. Clone this repository:
    ```bash
    git clone https://github.com/chandrakanthrck/CoreJava.git
    ```

2. Navigate to the directory containing the examples:
    ```bash
    cd threads
    ```

3. Compile and run the Java files using your preferred Java development environment or command-line tools.

## Contributing

Feel free to open issues or submit pull requests if you have suggestions or improvements. Contributions are welcome!

## License

This project is licensed under the MIT License.
