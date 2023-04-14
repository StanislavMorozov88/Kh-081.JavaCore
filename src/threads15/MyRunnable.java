package threads15;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
