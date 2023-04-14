package threads15;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("Wait");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter, "Waiter").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "Waiter1").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "Notifier").start();
        System.out.println("All thread started");
    }

}
