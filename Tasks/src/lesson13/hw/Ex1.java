package lesson13.hw;

import lesson13.MainPt;

/**
 * 1. Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */

public class Ex1 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> MainPt.textPrint(0, "Cat", 5));
        Thread thread1 = new Thread(() -> MainPt.textPrint(0, "Dog", 5));
        Thread thread2 = new Thread(() -> MainPt.textPrint(0, "Hamster", 5));

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        thread2.start();
    }
}