package pract12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleException {
    public static void main(String[] args) {
        int squareRectangle = square();
        System.out.println("Rectangle square is: " + squareRectangle);
    }

    public static int square() throws ArithmeticException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter value for a:");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter value for b:");
            int b = Integer.parseInt(br.readLine());
            if (a < 0 || b < 0) {throw new ArithmeticException();}
            return a * b;
        } catch (NumberFormatException | IOException e) {
            return -1;
        } catch (Exception e) {
            return -2;
        }
    }
}

