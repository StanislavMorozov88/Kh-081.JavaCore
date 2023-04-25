package edu15.practical;

public class task1 {
    public static void main(String[] args) {
    Thread thread = new Thread(new Runner());
    thread.start();

    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I study Java - " + i);
        }
    }
}