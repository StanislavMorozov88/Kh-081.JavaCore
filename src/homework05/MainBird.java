package homework05;

public class MainBird {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName());
            System.out.println(bird.fly());
        }
    }
}
