package Lesson6.Homework;

public class FlyingBird extends Bird{
    @Override
    public void fly() {

    }
}
class Eagle extends FlyingBird {
    @Override
    public String toString() {
        return "Eagle";
    }
    public void fly() {
        super.fly();
        System.out.println("I am an eagle and I can fly");
    }
}
class Swallow extends FlyingBird{
    @Override
    public String toString() {
        return "Swallow";
    }
    public void fly() {
        super.fly();
        System.out.println("I am a swallow and I can fly");
    }

}
