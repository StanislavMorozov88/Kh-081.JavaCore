package edu05.homework;
public class IntegerAnotherTask {
    static int secondPositiveNumber(int[] array){
       int indexOfTheFirstPositive = 0;
       int indexOfTheSecondPositive = 0;
       for(int i = 0; i < array.length; i++){
           if(array[i] > 0) indexOfTheFirstPositive = i;
       }
       for(int i = indexOfTheFirstPositive; i < array.length; i++){
           if(array[i] > 0) indexOfTheSecondPositive = i;
       }
        return indexOfTheSecondPositive;
    }
    static int minimumArray(int[] array){
        int minValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minValue) minValue = array[i];
        }
        return minValue;
    }
    static int minValuePosition(int[] array){
        int minValuePosition = array[0];
        int minValue = minimumArray(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == minValue) minValuePosition = i;
            break;
        }
        return minValuePosition;
    }
    static int productOfEvenNumbers(int[] array){
        int product = 1;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) product = array[i] * product;
        }
        return product;
    }
    static boolean arrayIsEmpty(int[] array){
        return array != null;
    }
    static int[] inializedArray(){
        int[] array = {
                -2, 4, 2, 1, -2
        };
        return array;
    }

    public static void main(String[] args) {
        int[] array = inializedArray();
        if(!arrayIsEmpty(inializedArray())) throw new IllegalArgumentException("Array is empty.");
        System.out.println("Position of the second positive numbers is: " + secondPositiveNumber(array));
        System.out.println("Minimum value in the array is: " + minimumArray(array));
        System.out.println("Minimum value position is: " + minValuePosition(array));
    }
}