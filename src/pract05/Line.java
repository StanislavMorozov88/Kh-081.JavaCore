package pract05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Line extends Point{

    Point point = new Point();
    int x = point.getX();
    int y = point.getY();
    public int x1, y1;
    public Line(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }
    public static void linePainted() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        coordinates();
        System.out.println("Enter a value for x1: ");
        int x1Value = Integer.parseInt(br.readLine());
        System.out.println("Enter a value for y1: ");
        int y1Value = Integer.parseInt(br.readLine());

        Line l = new Line(2,4,5,6);
        System.out.println("The Line is: " + l);
        br.close();
    }

    @Override
    public String toString() {
        return "Line{" +
                "point=" + point +
                ", x=" + x +
                ", y=" + y +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}

