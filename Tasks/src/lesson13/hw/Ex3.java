package lesson13.hw;

import lesson13.MainPt;

/**
 * 3. Create a thread «one», which would start the thread «two»,
 *   which has to output its number («Thread number two») 3 times and create thread «three»,
 *   which would to output message «Thread number three» 5 times.
 */

public class Ex3 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            //Thread two = new Thread();
            Thread two = new Thread(() -> {
                MainPt.textPrint(0, "Thread number two", 3);
                Thread three = new Thread(() -> MainPt.textPrint(0, "Thread number three", 5));
                three.start();
            });
            two.start();
        });
        one.start();
    }
}
