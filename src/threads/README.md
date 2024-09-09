# Multi-Threading Examples in Java

This repository contains various examples demonstrating multi-threading and concurrency in Java. Each file showcases different aspects of thread management and synchronization, providing practical insights into concurrent programming.

## Files and Descriptions

- **`CallableExample.java`**: Demonstrates the use of `Callable` and `Future` for tasks that return a result. It showcases how to submit tasks to an `ExecutorService` and retrieve results.

- **`CountDownLatchExample.java`**: Shows how to use `CountDownLatch` to synchronize threads by making one or more threads wait until a set of operations being performed in other threads completes.

- **`ExecutorServiceExample.java`**: Provides examples of using `ExecutorService` for managing and controlling thread execution. It includes examples of creating a thread pool and handling tasks.

- **`ReentrantLockExample.java`**: Illustrates the use of `ReentrantLock` for explicit locking and unlocking of critical sections, providing more advanced synchronization control compared to `synchronized` blocks.

- **`RunnableExample.java`**: Demonstrates the implementation of the `Runnable` interface for defining and running tasks in separate threads.

- **`SemaphoreExample.java`**: Shows how to use `Semaphore` to control access to a resource pool by multiple threads, managing permits for concurrent access.

- **`SynchronizedExample.java`**: Provides examples of using the `synchronized` keyword to achieve thread synchronization and prevent concurrent access to critical sections of code.

- **`ThreadExample.java`**: Illustrates the basics of creating and starting threads by extending the `Thread` class and overriding its `run` method.

- **`Main.java`**: Contains the main method to run and demonstrate the various multi-threading examples included in the repository.

- **`.gitignore`**: Specifies files and directories to be ignored by Git, such as compiled classes and IDE-specific files.

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

This project is licensed under the MIT License
