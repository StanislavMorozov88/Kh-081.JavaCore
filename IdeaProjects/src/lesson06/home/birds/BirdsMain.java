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
        Bird flyingBird = new FlyingBird("some feathers",12);
        Bird nonFlyingBird = new NonFlyingBirds("bright",10);


        Bird[] birds = {eagle1, penguin1, eagle2, swallow2, chicken1, swallow1, chicken2, penguin2,flyingBird,nonFlyingBird};

        for (Bird bird : birds) {
            bird.fly();
            if (bird instanceof NonFlyingBirds) {
                ((NonFlyingBirds) bird).walk();
            }
        }
        System.out.println();

        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
