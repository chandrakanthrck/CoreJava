package threads.synchronizd;

public class Chef extends Thread{
    private DishCounter counter;
    private String dishName;

    Chef(DishCounter counter, String dishName){
        this.counter = counter;
        this.dishName = dishName;
    }

    @Override
    public void run(){
        System.out.println(dishName + " is being prepared by " + Thread.currentThread().getName());
        try{
            Thread.sleep((int)(Math.random()* 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter.increment();
        System.out.println(dishName + " is completed by " + Thread.currentThread().getName());
    }
}
