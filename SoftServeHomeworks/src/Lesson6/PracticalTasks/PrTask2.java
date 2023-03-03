package Lesson6.PracticalTasks;

import java.awt.*;
import java.util.Arrays;

public class PrTask2 {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new ColorLine(Color.red);
        lines[1] = new Line(new Point(1,2), new Point(33,44));
        lines[2] = new ColorLine(new Point(123,222), new Point(332,441) , Color.pink);

        for (int i = 0; i < lines.length; i++) {
            lines[i].print();
        }

        System.out.println(Arrays.toString(lines));

    }


}
