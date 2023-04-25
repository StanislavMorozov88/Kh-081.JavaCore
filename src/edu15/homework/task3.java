package edu15.homework;

public class task3 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread number two - " + i);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread number three - " + i);
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread number one is started");
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread number one is ended");
            }
        });

        thread1.start();
        thread1.join();
    }
}
