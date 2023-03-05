package lesson5.hw1;

public class Eagle extends FlyingBird{
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("i can fly and i will eat u if u steal my eggs. x_x ");
    }
}
