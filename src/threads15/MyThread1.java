package threads15;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("Sum numbers from 0 to 1000 is " + sum);
    }

    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();  //running method in separate thread
       // thread.run();  //just running the method run()
    }
}
