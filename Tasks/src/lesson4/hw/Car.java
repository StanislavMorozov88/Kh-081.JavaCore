package lesson4.hw;

//4.   Create class Car with fields type, year of production and engine capacity.
//     Create and initialize four instances of class Car.
//      Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.
public class Car {
    private String type;
    private int year;
    private int power;

    public Car(String type, int year, int power) {
        this.type = type;
        this.year = year;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }
}
