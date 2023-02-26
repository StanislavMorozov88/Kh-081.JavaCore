package pract03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {

    private static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number1");
        int number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter number2");
        int number2 = Integer.parseInt(br.readLine());
        System.out.println("Enter number3");
        int number3 = Integer.parseInt(br.readLine());

        if (number1 % 2 != 0) {
            count++;
        }
        if (number2 % 2 != 0) {
            count++;
        }
        if (number3 % 2 != 0) {
            count++;
        }
        System.out.println("The count of odd numbers is " + count);
    }


}
