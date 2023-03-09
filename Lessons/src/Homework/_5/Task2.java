package Homework._5;

import Experiments.ConsoleMenuWrap;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        boolean isAllPositive = true;

        ConsoleMenuWrap page = new ConsoleMenuWrap();
        page.addLine("Hello, enter 10 numbers below:");
        page.show();
        page.clear();

        //вводимо наші числа
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            numbers[i] = sc.nextInt();
            if (numbers[i]<0){
                isAllPositive = false;
            }
        }
        sc.close();

        //рахуємо те, що просили
        int total;
        if (isAllPositive){
            total = 0;
            for (int i=0; i<5; i++){
                total += numbers[i];
            }
        } else{
            total = 1;
            for (int i=5; i<10; i++){
                total *= numbers[i];
            }
        }

        page.addLine("Your numbers: ");
        page.addLine(Arrays.toString(numbers));
        if(isAllPositive){
            page.addLine("The sum of the first five numbers is "+ total);
        }else {
            page.addLine("The product of the last five numbers is "+ total);
        }
        page.show();

    }
}
