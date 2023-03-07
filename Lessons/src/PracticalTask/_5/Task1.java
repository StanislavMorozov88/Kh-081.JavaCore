package PracticalTask._5;

import Experiments.ConsoleMenuWrap;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {

        int[] arr = getIntArr();
        ConsoleMenuWrap menu = new ConsoleMenuWrap();

        menu.addLine("Hello!");
        menu.addLine("There is array of integers:");
        menu.addLine(Arrays.toString(arr));
        menu.addLine(" ");
        menu.addLine("The biggest of these numbers: "+getBiggestNumber(arr));
        menu.addLine("The sum of positive numbers: "+ getSumOfPositive(arr));
        menu.addLine("Amount of negative numbers: "+amountOfNegative(arr));
        menu.show();
    }

    //лінь передавати змінні сюди, тому напсав ручками по 10
    private static int[] getIntArr(){
        int[] arr = new int[10];
        //Зерно генерації нехай буде добутком поточної скунди на наносекунду
        Random random = new Random((long) java.time.LocalTime.now().getSecond() *java.time.LocalTime.now().getNano());
        for(int i=0; i<arr.length; i++ ){
            arr[i]=random.nextInt(-10, 10);
        }
        return arr;
    }

    private static int getBiggestNumber(int[] arr){
        int temp = arr[0];
        for( int number : arr ){
            if (number > temp){
                temp = number;
            }
        }
        return temp;
    }

    private static int getSumOfPositive(int[] arr){
        int sum = 0;
        for (int number: arr) {
            if (number > 0){
                sum += number;
            }
        }
        return sum;
    }

    private static int amountOfNegative(int[] arr){
        int amount =0;
        for (int number : arr){
            if(number < 0){
                amount++;
            }
        }
        return amount;
    }
}
