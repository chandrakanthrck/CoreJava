package threads.synchronizd;

public class DishCounter {
    private int count;
    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }

}
