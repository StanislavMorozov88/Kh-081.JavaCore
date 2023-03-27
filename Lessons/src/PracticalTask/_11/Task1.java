package PracticalTask._11;

import java.util.Scanner;

public class Task1 {

    public static int squareRectangle(int a, int b) throws ArithmeticException {
        if(a<0 || b<0){
            throw new ArithmeticException("Length must be positive!");
        }
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(squareRectangle(sc.nextInt(), sc.nextInt()));
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }finally {
            sc.close();
        }

    }
}
//Зробити гарним