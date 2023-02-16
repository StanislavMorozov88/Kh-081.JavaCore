package practical_tasks;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        System.out.println("How are you?");
        String answer = readAnswer();
        printResult(answer);

    }

    private static String readAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printResult(String answer){
        System.out.println("You are " + answer);
    }
}
