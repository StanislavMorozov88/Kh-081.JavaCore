package lesson5.hw1;

public class Penguin extends NonFlyingBird{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("i can`t fly,im just cute and i can swim ^.^ ");
    }
}
