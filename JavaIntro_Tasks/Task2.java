import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hey! How are you?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("You are " + answer);
    }
}