package lesson06.practical.lines;

public class Line {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void print() {
        System.out.println("Print() method for Line");
        System.out.println(this);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
