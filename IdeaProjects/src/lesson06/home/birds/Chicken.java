package lesson06.home.birds;

public class Chicken extends NonFlyingBirds {

    public Chicken(String feathers, int layEggs, double maxWalkingSpeed) {
        super(feathers, layEggs);
        setMaxWalkingSpeed(maxWalkingSpeed);
    }

    @Override
    public void fly() {
        System.out.print("I am Chicken. ");
        super.fly();
    }

    @Override
    public void printWalkingStatus() {
        System.out.print("I am Chicken ");
        super.printWalkingStatus();
    }

    @Override
    public String toString() {
        return "Chicken{} " + super.toString();
    }
}
