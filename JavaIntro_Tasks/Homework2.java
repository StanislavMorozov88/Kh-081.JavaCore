import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Hey! What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Where are you live, "+ name + "?");
        String address = sc.nextLine();
        System.out.println("Your name is " + name + ", you live in " + address + "!");
    }
}