package Lesson12.Homework;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int count =1;
        do{
            try{
                System.out.println(readNumber(1,100));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }while(count++<10);
    }
    public static int readNumber(int start, int end){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(Integer.parseInt(a)< start || Integer.parseInt(a)>end || Integer.TYPE.desiredAssertionStatus()){
            throw new IndexOutOfBoundsException("Int not in boarders");
        }
        return Integer.parseInt(a);
    }
}
