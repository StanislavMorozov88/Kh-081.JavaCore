package edu05.homework.integer;

public class Integer {
    public static int calculate(int[] array) {
        int product = 1;
        int sum = 0;
        if (!arePositive(array)) {
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
            return sum;
        } else{
            for (int i = 5; i < array.length; i++) {
                product *= array[i];
            }
            return product;
        }
    }
    static boolean arePositive(int[] array){
        int k = 0;
        for(int i = 0; i < 5; i++){
            if(array[i] < 0) k++;
        }
        if(k > 0) return true;
        else return false;
    }
}
class Main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, -5, -6, 7, 8, 9, -10};
        System.out.println(Integer.calculate(array));
    }
}
