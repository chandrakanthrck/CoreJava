package threads.synchronizd;

public class Restaurant {
    public static void main(String[] args) {
        DishCounter counter = new DishCounter();
        Chef chef1 = new Chef(counter, "Dish 1");
        Chef chef2 = new Chef(counter, "Dish 2");
        Chef chef3 = new Chef(counter, "Dish 3");
        Chef chef4 = new Chef(counter, "Dish 4");
        Chef chef5 = new Chef(counter, "Dish 5");
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();
        chef5.start();
        try{
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
            chef5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total number of dishes cooked" + counter.getCount());
    }
}
