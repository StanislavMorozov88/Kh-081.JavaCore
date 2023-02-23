package Lesson1.PracticalTasks;
import java.util.Scanner;

public class PrTask2 {
    public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        int a1 = s1.nextInt();
        int a2 = s1.nextInt();
        int a3 = s1.nextInt();
        int av = a1+a2+a3;
        int avg = av/3;
        System.out.println(avg);


    }
}
