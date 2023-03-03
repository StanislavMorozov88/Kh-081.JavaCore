package Lesson6.PracticalTasks;

public class Truck extends Car{
    @Override
    public void run() {
        super.run();
        System.out.println("I am truck and i am riding");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("I am truck and i am not riding");
    }
}
