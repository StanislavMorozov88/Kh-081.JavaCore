package homework04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car[] cars = new Car[4];
        cars[0] = new Car("Honda", 1986, 1.6F);
        cars[1] = new Car("Fiat", 2012, 1.9F);
        cars[2] = new Car("Mitsubishi", 2003, 2.0F);
        cars[3] = new Car("Ford", 2010, 1.55F);

        //у тебе немає сортування, я додала
        for (int i = 1; i < cars.length; i++) {
            Car key = cars[i];
            int j = i - 1;
            while (j >= 0 && cars[j].getYear() < key.getYear()) { // or ">" for ASC oder
                cars[j + 1] = cars[j];
                j--;
            }
            cars[j + 1] = key;
        }

        // Print the sorted cars
        for (Car car : cars) {
            System.out.println(car.getType() + ", " + car.getYear() + ", " + car.getCapacity() + "cc");
        }

        System.out.println("Enter the model year: ");
        int yearNumber = Integer.parseInt(br.readLine());

        //System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            if (yearNumber == car.getYear()) {
                System.out.println(car);
            }
        }

    }
}
