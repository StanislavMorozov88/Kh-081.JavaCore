package lesson06.home.birds;

public class Chicken extends NonFlyingBirds{

    public Chicken(String feathers, int layEggs, double maxWalkingSpeed) {
        super(feathers, layEggs, maxWalkingSpeed);
    }

    @Override
    public void walk() {
        if (currentWalkingSpeed<getMaxWalkingSpeed()){
            currentWalkingSpeed+=(getMaxWalkingSpeed()*0.5);
            if (currentWalkingSpeed>getMaxWalkingSpeed()){
                currentWalkingSpeed = getMaxWalkingSpeed();
            }
        }
        printWalkingStatus();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void fly() {
        System.out.print("I am Chicken. ");
        super.fly();
    }

    @Override
    public void printWalkingStatus() {
        System.out.print("Chicken ");
        super.printWalkingStatus();
    }
}
