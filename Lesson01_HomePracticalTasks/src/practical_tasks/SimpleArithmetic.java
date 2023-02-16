package practical_tasks;

import java.util.Scanner;

public class SimpleArithmetic {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        int a = readNumber();
        System.out.println("Enter second number:");
        int b = readNumber();
        additionResult(a, b);
        subtractionResult(a, b);
        multiplicationResult(a, b);
        divisionResult(a, b);
    }

    private static void divisionResult(int a, int b) {
        if (b !=0) {
            System.out.printf("%d / %d = %,.2f%n", a, b, (double) a / b);
        }else System.out.println("Divided by zero isn't possible");
    }

    private static void multiplicationResult(int a, int b) {
        System.out.printf("%d * %d = %d%n",a,b,a*b);
    }

    private static void subtractionResult(int a, int b) {
        System.out.printf("%d - %d = %d%n",a,b,a-b);
    }

    private static void additionResult(int a, int b) {
        System.out.printf("%d + %d = %d%n",a,b,a+b);
    }

    private static int readNumber(){
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                System.err.println("It\'s not a number");
                input.nextLine();
            }
        }
    }
}
