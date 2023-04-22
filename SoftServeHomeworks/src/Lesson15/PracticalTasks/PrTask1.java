package Lesson15.PracticalTasks;

import java.util.stream.IntStream;

import static java.lang.Thread.sleep;
    public class PrTask1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("I learn Java");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static void main(String[] args) {
            PrTask1 a = new PrTask1();
            a.start();
            Thread newThread = new Thread(() -> IntStream.range(0,10)
                    .forEach(x -> {
                        System.out.println("I learn Java1");
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }));
            newThread.start();

        }
    }

