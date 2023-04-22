package Lesson15.Homeworks;

public class Hw2 {
    public static void main(String[] args) {
        Object first = new Object();
        Object second = new Object();

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "start");

            synchronized (first) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (second) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "end");
        }, "Thread 1");
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "start");
            synchronized (second) {
                synchronized (first) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "end");
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }

}
