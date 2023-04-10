package practtest;
import java.util.Scanner;
public class ReadConsole {
    public static int readNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int number = scanner.nextInt();
        return number;
    }
}
