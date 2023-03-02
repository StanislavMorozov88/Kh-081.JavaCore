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

        System.out.println("Enter the year: ");
        int yearNumber = Integer.parseInt(br.readLine());

        //System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            if (yearNumber == car.getYear()) {
                System.out.println(car);
            }
        }

    }
}
