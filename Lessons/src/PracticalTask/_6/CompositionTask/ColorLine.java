package PracticalTask._6.CompositionTask;

public class ColorLine extends Line {
    private Colors color;

    public ColorLine(Point p1, Point p2, Colors color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String print(){
        return color.getColor()
                + "from (" + this.getP1().getX() + ", " + this.getP1().getY() +") "
                + "to (" + this.getP2().getX() + ", " + this.getP2().getY() +") "
                + Colors.RESET.getColor();
    }

    @Override
    public String toString() {
        return "Line: [" +
                super.getP1().toString() + " " +
                super.getP2().toString()+ " Color: " + color.getColor()  + color.getName().toLowerCase() + Colors.RESET.getColor() +
                ']';
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
