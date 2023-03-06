package pract05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Point {
    public int x, y;
    public static void coordinates() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value for x: ");
        int xValue = Integer.parseInt(br.readLine());
        System.out.println("Enter a value for y: ");
        int yValue = Integer.parseInt(br.readLine());
        System.out.println("The Point is: "+ "(" +xValue+ "," +yValue+ ")");
    }
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
      @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) throws Exception {

        Line[] lines = new Line[2];
        Line[] lines1 = new ColorLine[2];
        lines[0] = new Line(12, 13, 45, 56);
        lines[1] = new Line(32, 5, 43, 23);
        lines1[0] = new ColorLine(2, 4, 56, 65, "red");
        lines1[1] = new ColorLine(3, 5, 76, 23, "white");

        System.out.println(Arrays.toString(lines));
        System.out.println(Arrays.toString(lines1));

        Line.linePainted();

        ColorLine c = new ColorLine(3, 4,5,6, "yellow");
        System.out.println(c);
    }
}
