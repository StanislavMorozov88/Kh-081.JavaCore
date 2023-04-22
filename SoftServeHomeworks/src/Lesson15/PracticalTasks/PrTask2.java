package Lesson15.PracticalTasks;

public class PrTask2 implements Runnable {
    private String message;
    private int interval;

    public PrTask2(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new Thread(new PrTask2("Hello world", 2000));
        Thread b = new Thread(new PrTask2("Peace in the world", 1000));
        a.start();
        b.start();
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is...");
    }
}