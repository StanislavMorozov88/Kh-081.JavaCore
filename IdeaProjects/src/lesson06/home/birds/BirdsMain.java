package lesson06.home.birds;

public class BirdsMain {
    public static void main(String[] args) {
        Bird eagle1 = new Eagle("grey", 10, 9000);
        FlyingBird eagle2 = new Eagle("grey", 8, 8000);
        Bird swallow1 = new Swallow("black", 10, 2000);
        FlyingBird swallow2 = new Swallow("black", 5, 1500);
        Bird penguin1 = new Penguin("black and white", 20, 12);
        NonFlyingBirds penguin2 = new Penguin("black", 10, 10);
        Bird chicken1 = new Chicken("white", 8, 8);
        NonFlyingBirds chicken2 = new Chicken("white", 12, 7);

        ((FlyingBird) eagle1).lend();
        eagle2.fly();
        swallow1.fly();
        swallow2.fly();
        swallow2.fly();
        ((NonFlyingBirds) penguin1).walk();
        penguin2.stop();
        ((NonFlyingBirds) chicken1).walk();
        chicken2.walk();
        System.out.println();

        Bird[] birds = {eagle1, penguin1, eagle2, swallow2, chicken1, swallow1, chicken2, penguin2};

        for (Bird bird : birds) {
            bird.fly();
            if (bird instanceof NonFlyingBirds) {
                ((NonFlyingBirds) bird).printWalkingStatus();
            }
        }
        System.out.println();

        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
