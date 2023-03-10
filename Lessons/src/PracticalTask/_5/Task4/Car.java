package PracticalTask._5.Task4;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String type;
    private int yearOfProduct;
    private double engineCapacity;

    private static Car[] cars = new Car[1];

    private static void addCar(Car car){
        if (cars.length == 1){
            cars[0] = car;
        }else {
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[cars.length-1] = car;
        }
    }




    @Override
    public String toString() {
        return "[" +
                "type: '" + type + '\'' +
                ", year: " + yearOfProduct +
                ", engine: " + engineCapacity +
                "l]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getYearOfProduct() == car.getYearOfProduct() &&
                Double.compare(car.getEngineCapacity(), getEngineCapacity()) == 0 && getType().equals(car.getType());
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(getType(), getYearOfProduct(), getEngineCapacity());
    }

    public Car(String type, int yearOfProduct, double engineCapacity) {
        this.type = type;
        this.yearOfProduct = yearOfProduct;
        this.engineCapacity = engineCapacity;
        addCar(this);
    }

    public Car(){
        addCar(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int year) throws Exception {
        if (year < 1){
            throw new Exception("Are this car is ancient???");
        }
        yearOfProduct = year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) throws Exception {
        if (engineCapacity < 0){
            throw new Exception("Ayoo, anti-space engine or something??");
        }
        this.engineCapacity = engineCapacity;
    }
}
