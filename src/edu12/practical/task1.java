package edu12.practical;

import java.util.Scanner;

public class task1 {

    static void squareRectangle (int a, int b) throws MyException {
        if ( a > 0 & b > 0){
            int square = a * b;
            System.out.println("Square = " + square);
        } else {
            throw new MyException("Input is wrong!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input integer two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        try{
        squareRectangle(a,b);
        } catch (MyException e1) {
        System.err.print(e1);
        }

    }

}

class MyException extends Exception {
    // Classic constructor with a message of error
    public MyException(String msg) {
        super(msg);
    }

}
