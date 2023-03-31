package homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dividing {
    public static void main(String[] args) {
        double d = div();
        System.out.println("The result is: " + d);
    }

    public static double div() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter value for a:");
            double a = Double.doubleToLongBits(Double.parseDouble(br.readLine()));
            System.out.println("Enter value for b:");
            double b = Double.doubleToLongBits(Double.parseDouble(br.readLine()));
            return a / b;
        } catch (NumberFormatException e) {
            return -1;
        } catch (ArithmeticException e) {
            return -2;
        } catch (Exception e) {
            return -3;

        }

    }
}
