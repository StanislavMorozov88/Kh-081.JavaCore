package PracticalTask._6.CarWithAudio;

import java.io.File;

public class Truck extends Car{

    public Truck(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void run() throws Exception {
        File file = new File("src\\PracticalTask\\_6\\CarWithAudio\\audio\\Truck_start.wav");
        playAudio(file);
    }

    @Override
    public void stop() throws Exception {
        File file = new File("src\\PracticalTask\\_6\\CarWithAudio\\audio\\Stop.wav");
        playAudio(file);
    }

    @Override
    public void info() {
        System.out.println("Truck model: " + model + ",\tmax speed: " + maxSpeed + "km/h,\tmade in " + yearOfManufacture + " year;");
        try {
            run();
            stop();
            System.out.println("-Works properly");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
