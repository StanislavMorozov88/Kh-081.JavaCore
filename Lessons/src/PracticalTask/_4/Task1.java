package PracticalTask._4;
import java.util.Scanner;
public class Task1 {


    public static void main(String[] args) {
        System.out.println("Please, enter 3 numbers:");
        int num = numOfOdd(3);
        System.out.println("From the list of numbers "+ num +" are odd");

    }
    private static int numOfOdd(int len){
        double num[] = new double[len];
        Scanner sc = new Scanner(System.in);
        int count =0;

        for (int i=0; i < num.length; i++ ){
            num[i]=sc.nextDouble();
            if(num[i] != 0 && num[i]%2 != 0){
                count++;
            }
        }

        sc.close();
        return count;
    }
}
