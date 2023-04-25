package edu15.homework;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Message 1 - " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Message 2 - " + i);
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
                    System.out.println("Message 3 - " + i);
                }
            }
        });

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
    thread3.start();
    }
}


