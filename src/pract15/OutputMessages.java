package pract15;

public class OutputMessages extends Thread {

    private String message;
    private int pause;
    public OutputMessages(String message, int pause) {
        this.message = message;
        this.pause = pause;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(message);
        }
    }
}
class Message {
    public static void main(String[] args) throws InterruptedException {
        Thread message1 = new OutputMessages("Hello, world", 2000);
        Thread message2 = new OutputMessages("Peace in the peace", 3000);
        message1.start();
        message2.start();
        message1.join();
        message2.join();
        System.out.println("My name is Yuliia)");
    }
}
