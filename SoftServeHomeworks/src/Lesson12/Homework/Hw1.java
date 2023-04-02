package Lesson12.Homework;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            try {
                System.out.println(div(a, b));
                sc.close();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
           }
        }while (true);


    }
    public static double div(double a,double b){
        if(a==0||b==0){
            throw new IllegalArgumentException("doubles can't be 0");
        }
        return a/b;
    }
}
