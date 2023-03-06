package pract05;

public class ColorLine extends Line{
    private String color = "blue";

    public ColorLine(int x, int y, int x1, int y1, String color) {
        super(x, y, x1, y1);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';

    }
    public void colorPrint() {
        System.out.println(getColor());
    }

}
