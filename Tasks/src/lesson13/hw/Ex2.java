package lesson13.hw;

/**
 * 2. Cause a deadlock. Organize the expectations of ending a thread in main(),
 *   and make the end of the method main() in this thread.
 */
public class Ex2 {
    static class DeadLock extends Thread {
        final static Object first = new Object();
        final static Object second = new Object();

        static Thread thread = new Thread(() -> {
            synchronized (first) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (second) {
                    System.out.println("thread 1");
                }
            }
        });

        static Thread thread1 = new Thread(() -> {
            synchronized (second) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (first) {
                    System.out.println("thread 2");
                }
            }
        });

    }

    public static void main(String[] args) throws InterruptedException {
        DeadLock.thread.start();
        DeadLock.thread1.start();
        DeadLock.thread.join();
        DeadLock.thread1.join();
        System.out.println("End of main");
    }
}
