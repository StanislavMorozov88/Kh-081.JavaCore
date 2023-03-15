package Homework._5.Task4;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String type;
    private int yearOfProduct;
    private double engineCapacity;

    private static Car[] cars = new Car[0];

    private static void addCar(Car car){
        try {
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[cars.length-1] = car;
        }catch (Exception e){
            cars[0] = car;
        }
    }

    public static Car[] getCarsOfYear (int year){
        Car[] sameYearCars = new Car[0];
        for(Car car: cars){
            if(car.yearOfProduct!=year){
                continue;
            }
            try {
                sameYearCars = Arrays.copyOf(sameYearCars, sameYearCars.length + 1);
                sameYearCars[sameYearCars.length-1] = car;
            }catch (Exception e){
                sameYearCars[0] = car;
            }
        }
        return sameYearCars;
    }

    public static Car[] getSortedCars(){
        Car[] tmpCars = cars;
        Car tmp;
        for (int i = 0; i < tmpCars.length - 1; i++) {
            for (int j = i + 1; j < tmpCars.length; j++) {
                if (tmpCars[i].getYearOfProduct() < tmpCars[j].getYearOfProduct()) {
                    tmp = tmpCars[i];
                    tmpCars[i] = tmpCars[j];
                    tmpCars[j] = tmp;
                }
            }
        }
        return tmpCars;
    }

    public static Car[] getSortedCars(Car[] cars){
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduct() < cars[j].getYearOfProduct()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        return cars;
    }

    @Override
    public String toString() {
        return "\t" + type  + ",\t"+ yearOfProduct + "y.,\t" + engineCapacity + "l;";
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

    public static Car[] getCars() {
        return cars;
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
