package pract15;

public class OutputText implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("I study Java");
        }
    }

    public static void main(String[] args) {
        OutputText text = new OutputText();
        text.run();
    }
}
