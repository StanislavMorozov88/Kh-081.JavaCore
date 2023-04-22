package Lesson15.Homeworks;

import Lesson15.PracticalTasks.PrTask2;

public class Hw1 implements Runnable{
    private String message;
    private int interval;

    public Hw1(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + i + Thread.currentThread().getName()); // Почему ничего не печатается кpоме месседжа???
            System.out.println(i);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new Thread(new PrTask2("Thread 1 started ", 1000));
        Thread b = new Thread(new PrTask2("Thread 2 started ", 1500));
        Thread c = new Thread(new PrTask2("Thread 3 started ", 100));
        a.start();
        b.start();


        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c.start();
    }
}
