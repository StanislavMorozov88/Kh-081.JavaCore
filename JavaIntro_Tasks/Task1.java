import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Hey! Input two nums:");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        int div = firstNum / secondNum;
        int modulus = firstNum % secondNum;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + modulus);

    }
}