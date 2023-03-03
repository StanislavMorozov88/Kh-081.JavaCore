package Lesson6.Homework;

public class NonFlyingBird extends Bird{
    @Override
    public void fly() {

    }
}
class Penguin extends NonFlyingBird{
    @Override
    public String toString() {
        return "Penguin";
    }
    @Override
    public void fly() {
        super.fly();
        System.out.println("I am a penguin and I can't fly");
    }
}
class Chicken extends NonFlyingBird{
    @Override
    public String toString() {
        return "Chicken";
    }

    public void fly() {
        super.fly();
        System.out.println("I am a chicken and I can't fly");
    }

}