package PracticalTask._6.CarWithAudio.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class Car {
    protected String model;
    protected double maxSpeed;
    protected int yearOfManufacture;

    public abstract void run() throws Exception;
    public abstract void stop() throws Exception;
    public abstract void info();

    protected static void playAudio(File file) throws Exception {
        try {
            //створюєм аудіокліп
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            //рахуєм його довжину
            AudioFormat format = audioStream.getFormat();
            long frames = audioStream.getFrameLength();
            double durationInSeconds = (frames+0.0) / format.getFrameRate();
            //граєм звук і чекаємо, щоб звук зіграв
            clip.open(audioStream);
            clip.start();
            SECONDS.sleep((int)durationInSeconds);
            clip.close();
        }catch (Exception e){
            throw new Exception("Sound can`t be played");
        }
    }

    public Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}

/*
        Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
        Develop classes Truck and Sedan which extend class Car.
        In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.
*/
