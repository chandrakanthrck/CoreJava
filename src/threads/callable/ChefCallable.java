package threads.callable;

import java.util.concurrent.Callable;

/**
 * Callable is similar to Runnable but can return a result and throw exceptions.
 *
 * Use Case: When you need to perform a task in a separate thread that returns a result or can throw checked exceptions.
 * Example: Fetching data from a remote service in the background and returning the result.
 */

public class ChefCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Chef is preparing the dish");
        Thread.sleep(3000);
        //unlike runnable, callable returns the status of the execution
        //it can also tell it takes some more time
        return "Dish is ready";
    }
}
