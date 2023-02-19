package homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class Circle {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter radius");
        int r = Integer.parseInt(br.readLine());

        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter is " + perimeter);

        double area = Math.PI*r*r;
        System.out.println("Area is " + area);

    }
}
