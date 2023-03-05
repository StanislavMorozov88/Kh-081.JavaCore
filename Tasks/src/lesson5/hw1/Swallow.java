package lesson5.hw1;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("i can fly so fast ;) ");
    }
}
