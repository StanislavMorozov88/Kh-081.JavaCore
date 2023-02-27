import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // homeWorkFirst();
       // homeWorkSecond();

    }

    public static void homeWorkFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        float a = scanner.nextFloat();
        System.out.println("enter number:");
        float b = scanner.nextFloat();
        System.out.println("enter number:");
        float c = scanner.nextFloat();
        if (5 >= a && a >= -5 && 5 >= b && b >= -5 && 5 >= c && c >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }
        if (5 >= b && b >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }
        if (5 >= c && c >= -5) {
            System.out.println("number is in range[-5,5]");
        } else {
            System.out.println("number isn't in range[-5,5]");
        }
        scanner.close();
    }

    public static void homeWorkSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int a = scanner.nextInt();
        System.out.println("enter number:");
        int b = scanner.nextInt();
        System.out.println("enter number:");
        int c = scanner.nextInt();
        int max=a;
        int min=a;
        if (b>max) {
            max=b;
        } else if (max<c) {
            max=c;
        }
        if (min >b) {
            min=b;
        } else if (min>c) {
            min=c;
        }
        System.out.println("max number:" + max + "\nmin number:" +min);
        scanner.close();
    }


}
