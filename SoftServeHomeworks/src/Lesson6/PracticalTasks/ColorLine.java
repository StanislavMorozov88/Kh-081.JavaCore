package Lesson6.PracticalTasks;
import java.awt.Color;


public class ColorLine extends Line{
    private Color color;


    public ColorLine(Color color) {
        this.color = color;
    }

    public ColorLine(Point p1, Point p2, Color color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color=" + color +
                '}';
    }
    public void print(){
        System.out.println(color);
    }
}
