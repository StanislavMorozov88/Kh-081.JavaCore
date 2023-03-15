package PracticalTask._6.CarWithAudio;

import java.io.File;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void run() throws Exception {
        File file = new File("src\\PracticalTask\\_6\\CarWithAudio\\audio\\Sedan_start.wav");
        playAudio(file);
    }

    @Override
    public void stop() throws Exception {
        File file = new File("src\\PracticalTask\\_6\\CarWithAudio\\audio\\Stop.wav");
        playAudio(file);
    }

    @Override
    public void info() {
        System.out.println("Sedan model: " + model + ",\tmax speed: " + maxSpeed + "km/h,\tmade in " + yearOfManufacture +" year;");
        try {
            run();
            stop();
            System.out.println("-Works properly");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }


}
