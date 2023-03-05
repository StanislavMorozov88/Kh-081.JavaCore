package lesson5.pt2;

//      Line which contains two object of Point class
//  Override method toString() and define method print() in every classes`
public class Line {
    //i make protected to can them in subclasses
    //and dont make getters)

    protected Point start;
    protected Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    void print() {
        System.out.println("Start: " + start + " End: " + end);
    }
}
