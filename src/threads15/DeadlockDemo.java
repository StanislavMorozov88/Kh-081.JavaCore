package threads15;

public class DeadlockDemo extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();
    static Thread t1 = new Thread() {
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (second) {
                    System.out.println("Success 1!");
                }
            }
        }
    };
    static Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    synchronized (first) {
                        System.out.println("Success 2!");
                    }
                }
            }
        };

        public static void main(String[] args) {
            t1.start();
            t2.start();
            try {
                Thread.sleep(20);
            } catch (Exception e) {
            }
            System.out.println(t1.getState());   //BLOCKED
            System.out.println(t2.getState());   //BLOCKED
        }
}
