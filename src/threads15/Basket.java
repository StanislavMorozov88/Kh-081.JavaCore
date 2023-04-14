package threads15;

public class Basket {
    private String fruit;
    private volatile boolean fruitIsAvailable = false;

    synchronized String getFruit() {
        while (!fruitIsAvailable) try {
            wait();
        } catch (InterruptedException e) {
        }
        System.out.println("Get: " + fruit);
        fruitIsAvailable = false;
        notify();
        return fruit;
    }

    synchronized void putFruit(String fruit) {
        while (fruitIsAvailable) try {
            wait();
        } catch (InterruptedException e) {
        }
        this.fruit = fruit;
        fruitIsAvailable = true;
        System.out.println("Put: " + fruit);
        notify();
    }
//
//    public String getFruit() {
//        System.out.println("Get: " + fruit);
//        return fruit;
//    }
//    public void putFruit(String fruit) {
//        this.fruit = fruit;
//        System.out.println("Put: " + fruit);
//    }

}
