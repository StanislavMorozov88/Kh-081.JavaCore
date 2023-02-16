package practical_tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int[]numbers = new int[3];
        int index = 0;
        System.out.println("Input first number: ");
        numbers[index++]=readNumber();
        System.out.println("Input second number:");
        numbers[index++]=readNumber();
        System.out.println("Input third numbers:");
        numbers[index]=readNumber();
        double average = average(numbers);
        System.out.println("Average is "+average);

    }

    private static double average(int[] numbers) {
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        return average/numbers.length;
    }

    private static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.err.println("It's not a number");
                scanner.nextLine();
            }
        }
    }
}
