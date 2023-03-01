package lesson05.home;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    static final Scanner SC;

    static {
        SC = new Scanner(System.in);
    }

    private String type;
    private int yearProduction;
    private int engineCapacity;

    public Car(String type, int yearProduction, int engineCapacity) {
        checkType(type);
        checkYearProduction(yearProduction);
        checkEngineCapacity(engineCapacity);
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    private void checkType(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type is null or empty.");
        }
    }

    private void checkYearProduction(int year) {
        if (year <= 0 && year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Not valid year");
        }
    }

    private void checkEngineCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Negative or zero capacity");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void main(String[] args) {
        Car[] cars = {new Car("sedan", 1990, 210),
                new Car("hatchback", 1985, 200),
                new Car("micro", 2000, 150),
                new Car("cabriolet", 1985, 250),
                new Car("sportcar", 1990, 270)};

        System.out.println(Arrays.toString(getCertainYearModel(cars)));
        System.out.println(Arrays.toString(cars));
        sortCarsByYearAsc(cars);
        System.out.println(Arrays.toString(cars));


    }

    public static void sortCarsByYearAsc(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].yearProduction > cars[j + 1].yearProduction) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public static Car[] getCertainYearModel(Car[] cars) {
        int number = validateData();
        Car[] carArr = new Car[cars.length];
        int count = 0;
        for (Car car : cars) {
            if (car.yearProduction == number) {
                carArr[count++] = car;
            }
        }
        return Arrays.copyOf(carArr, count);
    }


    private static int validateYear(int year) throws IllegalArgumentException {
        if (year <= 0) {
            throw new IllegalArgumentException();
        }
        return year;
    }

    public static int validateData() {
        while (true) {
            try {
                System.out.println("Enter year: ");
                return validateYear(readNumberFromConsole());
            } catch (IllegalArgumentException e) {
                System.err.println("Year is negative");
            }
        }
    }

    private static int readNumberFromConsole() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Not integer");
                SC.nextLine();
            }
        }
    }
}
