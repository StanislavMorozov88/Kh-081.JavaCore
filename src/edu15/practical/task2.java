package edu15.practical;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
    MyThread thread1 = new MyThread();
    thread1.start();
    thread1.join();
    System.out.println("My name is Ihor");
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello, world - " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Peace in the peace - " + i);
        }
    }
}