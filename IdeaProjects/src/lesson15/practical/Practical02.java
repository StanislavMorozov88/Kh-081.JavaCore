package lesson15.practical;

import java.util.concurrent.TimeUnit;

public class Practical02 implements Runnable{
    private String message;
    private int waiting;

    public Practical02(String message, int waiting) {
        this.message = message;
        this.waiting = waiting;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is started");
        for (int i = 0;i<5;i++){
            System.out.println(message);
            try {
                TimeUnit.SECONDS.sleep(waiting);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " is done");
    }

    public static void main(String[] args) {
        System.out.println("MainThread " + Thread.currentThread().getName() + " is started");
        Thread myThread1 = new Thread(new Practical02("Hello, world",2),"MyThread1");
        Thread myThread2 = new Thread(new Practical02("Peace in the peace",3),"MyThread2");

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("My name is Olena");
        System.out.println("MainThread " + Thread.currentThread().getName() + " is done");
    }
}
