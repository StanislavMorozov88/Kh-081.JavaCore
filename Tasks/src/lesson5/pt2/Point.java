package lesson5.pt2;

//      Point with attributes x and y
//  Override method toString() and define method print() in every classes`

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //  Override method toString()
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //define method print() in every classes`
     void print() {
        System.out.print(toString());
    }
}
