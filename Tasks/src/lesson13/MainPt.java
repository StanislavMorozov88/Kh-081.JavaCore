package lesson13;

import static java.lang.Thread.sleep;

/**
 * 1. Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 * 2. Output two messages «Hello, world»
 * and «Peace in the peace» 5 times each with the intervals of 2 seconds,
 * and the second - 3 seconds.
 * After printing messages, print the text «My name is …»
 */

public class MainPt {
    public static void main(String[] args) {
        //1
        new Thread(() -> textPrint(1000, "Hello, world", 10)).start();

        //2
        Thread thread = new Thread(() -> textPrint(2000, "Hello, world", 5));
        Thread thread1 = new Thread(() -> textPrint(3000, "Peace in the peace", 5));

        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("My name is …");

    }

    /**
     * Output text certain number of times with the intervals of one second (Thread.sleep(sleepTime);)
     * @param sleepTime
     * @param text
     * @param times
     */
    public static void textPrint(int sleepTime, String text, int times) {
        for (int i = 0; i < times; i++) {
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(text);
        }
    }
}
