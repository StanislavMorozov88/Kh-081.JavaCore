package PracticalTask._5;

import Experiments.ConsoleMenuWrap;
import java.util.Arrays;
import java.util.Scanner;
import static Homework._5.Task1.getEnd;

public class Task3 {

    static public int[] getArr(int length) throws Exception{
        if(length<1){
            throw new Exception("Array length mus be bigger than 0!");
        }

        int[] numbers = new int[length];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<length; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return  numbers;
    }

    public static String getArrInfo(int[] numbers) throws Exception {
        int positionOfSecondPositive =0;
        int countPositive =0;
        int minNumber = 0;
        int positionOfMin = 1;
        int productOfEven = 1;

        for (int i =0; i<numbers.length; i++){
            //Рахуємо
            if(numbers[i]>0){
                countPositive++;
            }
            if(countPositive == 2){
                positionOfSecondPositive = i+1;
            }
            //позиція і значення найменшого
            if(i==0){
                minNumber = numbers[i];
            }else if(minNumber > numbers[i]){
                minNumber = numbers[i];
                positionOfMin = i+1;
            }
            //сума парних числе
            if (numbers[i]%2 == 0 && numbers[i]!=0){
                productOfEven *= numbers[i];
            }
        }

        if(positionOfSecondPositive == 0){
            return "There is no second positive numbers.\n" +
                    "The smallest number is " + minNumber + " in " + positionOfMin + getEnd(positionOfMin) + " position.\n" +
                    "The total product of even numbers is " + productOfEven;
        }else {
            return "Position of second positive number: " + positionOfSecondPositive + "\n" +
                    "The smallest number is " + minNumber + " in " + positionOfMin + getEnd(positionOfMin) + " position.\n" +
                    "The total product of even numbers is " + productOfEven;
        }

    }

    public static void main(String[] args) {

        ConsoleMenuWrap menu = new ConsoleMenuWrap();
        menu.addLine("Hello, please enter 5 numbers below:");
        menu.show();
        menu.clear();

        try {
            int[] arr = getArr(5);
            menu.addLine("Your numbers:");
            menu.addLine(Arrays.toString(arr));
            menu.addLine(getArrInfo(arr));
        }catch (Exception e){
            System.err.println(e.getMessage());
            return;
        }

        menu.show(42);
    }
}
