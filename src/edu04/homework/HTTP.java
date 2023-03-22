package edu04.homework;

import java.util.Scanner;

public class HTTP {
    enum HTTPError{
        HTTP_ERROR401("Authentication is required but has failed or not been provided."),
        HTTP_ERROR403("Valid request was sent, but the server refuses to accept it."),
        HTTP_ERROR404("The request is valid, but the resource cannot be found on the server.");

        private final String errorDetails;

        HTTPError(String errorDetails) {
            this.errorDetails = errorDetails;
        }

        public String getErrorDetails() {
            return errorDetails;
        }
    }

    public static void main(String[] args) {
        System.out.println("What is the number of your HTTP error?");
        Scanner sc = new Scanner(System.in);
        int numError = sc.nextInt();
        switch (numError) {
            case 401 -> System.out.println(HTTPError.HTTP_ERROR401.getErrorDetails());
            case 403 -> System.out.println(HTTPError.HTTP_ERROR403.getErrorDetails());
            case 404 -> System.out.println(HTTPError.HTTP_ERROR404.getErrorDetails());
            default -> System.out.println("We do not have this error in out database.");
        }
    }

}
class Main{
    //read float numbers and check: are all they belong to range [-5; 5]
    static void theOneWithTheFloatArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int arrayLength = sc.nextInt();
        double[] checkArray = new double[arrayLength];
        System.out.println("Write all the numbers.");
        for(int i = 0; i < arrayLength; i++){
            checkArray[i] = sc.nextInt();
        }
        if(checkFloatNumbers(checkArray)) System.out.println("All numbers are in the right range.");
        else System.out.println("One or more numbers are out of range.");
    }
    static boolean checkFloatNumbers(double[] arr){
        for (double v : arr) {
            return v <= 5 || v >= -5;
        }
        return false;
    }

    //read 3 integers and write min and max out of them
    static int maxIntNumber(int[] array){
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > maxNum) maxNum = array[i];
        }
        return maxNum;
    }
    static int minIntNumber(int[] array){
        int minNum = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < minNum) minNum = array[i];
        }
        return minNum;
    }
    static void theOneWithTheIntArray(){
        Scanner sc = new Scanner(System.in);
        int arrayLength = 3;
        int[] checkArray = new int[arrayLength];
        System.out.println("Write all the numbers.");
        for(int i = 0; i < arrayLength; i++){
            checkArray[i] = sc.nextInt();
        }
        System.out.println("The max number of the array is " + maxIntNumber(checkArray));
        System.out.println("The min number of the array is " + minIntNumber(checkArray));

    }
    public static void main(String[] args) {
       theOneWithTheFloatArray();
       theOneWithTheIntArray();
    }
}
