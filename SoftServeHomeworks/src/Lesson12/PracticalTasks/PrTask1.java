package Lesson12.PracticalTasks;


import java.util.Scanner;

public class PrTask1 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 int");
            int a = sc.nextInt();
            System.out.println("Enter 2 int");
            int b = sc.nextInt();
            try {
                System.out.println("area is " + area(a, b));
                sc.close();
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static int area(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Length is less than 0");
        }

        return a * b;
    }
}
