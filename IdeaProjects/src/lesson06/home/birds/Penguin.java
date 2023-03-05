package lesson06.home.birds;

public class Penguin extends NonFlyingBirds {

    public Penguin(String feathers, int layEggs, double maxWalkingSpeed) {
        super(feathers, layEggs);
        setMaxWalkingSpeed(maxWalkingSpeed);
    }

    @Override
    public void fly() {
        System.out.print("I am Penguin. ");
        super.fly();
    }

    @Override
    public void printWalkingStatus() {
        System.out.print("I am Penguin ");
        super.printWalkingStatus();
    }

    @Override
    public String toString() {
        return "Penguin{} " + super.toString();
    }
}
