package edu12.homework;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Input two double numbers:");
        Scanner scan = new Scanner(System.in);
        double input1 = scan.nextDouble();
        double input2 = scan.nextDouble();
        scan.close();
        System.out.println("Input: " + input1 + ", " + input2);
        div(input1, input2);

    }

    public static void div (double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Can't divide by 0.");
            }
            double result = a / b;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e){
            e.printStackTrace( );
            System.out.println(e.getMessage());
        }
    }
}
