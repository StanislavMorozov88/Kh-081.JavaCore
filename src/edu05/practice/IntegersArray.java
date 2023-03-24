package edu05.practice;

public class IntegersArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minNumberInArray = -15;
        int maxNumberInArray = 15;
        int range = maxNumberInArray - minNumberInArray + 1;
        //Fill the array with random numbers in range from -15 to 15
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * range) + minNumberInArray;
            System.out.println(array[i]);
        }
        //Amount of negative numbers + maximum number in the array
        int maxNum = array[0];
        int countMins = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
            if(array[i] < 0) countMins++;
        }
        //Sum of all positive numbers
        int sumOfMaxNums = 0;
        for(int i  = 0; i < array.length; i++){
            if(array[i] >= 0) sumOfMaxNums += array[i];
        }
        //Output of all the tasks here
        System.out.println("The biggest number is: " + maxNum);
        System.out.println("The amount of negative numbers is: " + countMins);
        System.out.println("The sum of all the numbers is: " + sumOfMaxNums);


    }
}
