package Lesson6.PracticalTasks;

public class Sedan extends Car{
    @Override
    public void stop() {
        super.stop();
        System.out.println("I am sedan and i am not riding");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("I am sedan and i am riding");
    }
}
