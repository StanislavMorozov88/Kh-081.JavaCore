package Lesson5.Homework;

public class Car {
    private String type;
    private int yearOfProduction;
    private float engineCapacity;
    public Car(String type , int yearOfProduction, float engineCapacity ){
        this.engineCapacity = engineCapacity;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
