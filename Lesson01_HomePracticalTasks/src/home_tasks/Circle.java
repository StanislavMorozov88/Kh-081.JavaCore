package home_tasks;

import java.util.Scanner;

public class Circle {
    private static final double PI = Math.PI;
    private double radius;

    public Circle(){
        this.radius = readRadius();
    }

    public double perimeter(){
        return 2*PI*getRadius();
    }

    public double area(){
        return PI * Math.pow(getRadius(),2);
    }

    private double readRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        while (true) {
            try {
                double radius= input.nextDouble();
                if (radius<=0){
                    System.out.println("Radius must be greater than zero");
                } else {
                    return radius;
                }
            }
            catch (java.util.InputMismatchException e) {
                System.err.println("It's not a valid radius");
                input.nextLine();
            }
        }
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area is " + circle.area());
        System.out.println("Perimeter is " + circle.perimeter());
    }
}
