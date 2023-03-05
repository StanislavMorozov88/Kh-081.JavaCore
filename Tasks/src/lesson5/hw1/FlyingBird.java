package lesson5.hw1;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    //private String name;
    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
