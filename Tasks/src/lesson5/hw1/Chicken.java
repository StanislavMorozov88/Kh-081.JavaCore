package lesson5.hw1;

public class Chicken extends NonFlyingBird{
    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);

    }

    @Override
    public void fly() {
        System.out.println("i can`t fly, but i will bite if u steal my eggs. xD");
    }
}

