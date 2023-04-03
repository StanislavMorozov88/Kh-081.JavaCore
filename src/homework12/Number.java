package homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) {
        int n = readNumber(1, 100);
    }

    public static int readNumber(int start, int end) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrNumbers = new int[10];
        int input;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a value: ");
            try {
                input = Integer.parseInt(br.readLine());
                arrNumbers[i] = input;
                if (input > 1 && input < 100) {
                    System.out.println("Entered value is in range (1- 100): " + input);
                } else
                    System.out.println("Entered value is out of range");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: invalid input");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } return 0;
    }
}



