package lesson15.practical;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Practical01 {
    public static void main(String[] args) {

        Thread myThread = new Thread(()->IntStream.range(0,10)
                .forEach(i->{
                    System.out.println("I study Java");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));
        myThread.start();
    }
}
