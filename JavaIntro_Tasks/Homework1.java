import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Hey! Enter radius: ");
        Scanner sc =new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        //Math.pow(a1,a2) возведение числа в степень(второй аргумент - степень)
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Area: "+ area);
    }
}