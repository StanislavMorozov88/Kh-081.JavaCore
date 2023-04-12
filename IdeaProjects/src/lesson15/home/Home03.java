package lesson15.home;

import java.util.stream.IntStream;

public class Home03 {

    public static void printThreadName(int endExclusive) {
        IntStream.range(0, endExclusive)
                .forEach(i -> System.out.println(Thread.currentThread().getName()));
    }

    public static void main(String[] args) {

        Thread threadChain = new Thread(() -> {
            new Thread(() -> {
                printThreadName(3);
                new Thread(() -> {
                    printThreadName(5);
                }, "Thread-3").start();
            }, "Thread-2").start();
        }, "Thread-1");
        threadChain.start();

    }
}
