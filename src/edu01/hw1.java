package edu01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input radius:");
        int r = Integer.parseInt(br.readLine());
        System.out.println("radius = " + r);

        double p = 2 * Math.PI * r;
        System.out.println("perimeter = " + p);

        double a = Math.PI * Math.pow(r, 2);
        System.out.println("area = " + a);

    }
}
