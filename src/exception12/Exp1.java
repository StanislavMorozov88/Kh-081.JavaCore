package exception12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exp1 {
    public static void main(String[] args) throws IOException {
        //op1
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input number");
            int k = Integer.parseInt(br.readLine());

        } catch (IOException | NumberFormatException e){
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            //op2
            int i = 4;
            int j = 35;
            System.out.println("Result: " + (i / j));
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        try {//op3
            int[] a = new int[2];
            a[1] = 0;
            System.out.println(a[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }

        //op4
        System.out.println("Hello");

    }
}
