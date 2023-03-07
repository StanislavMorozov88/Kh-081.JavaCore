package Experiments;

public class Test {
    public static void main(String[] args) {
        ConsoleMenuWrap menu = new ConsoleMenuWrap();

        menu.addLine("Hello 1");
        menu.addLine("Hello 2");
        menu.addLine("Hello 3");
        menu.addLine("Hello 4");
        menu.addLine("Hello 5");
        menu.addLine("Hello 6");
        menu.addLine("Hello 7");
        menu.addLine("Hello 8");
        menu.addLine(Integer.toString(menu.getNumberOfLines()));
        menu.show();

        menu.delete();
        menu.delete(2);
        menu.addLine(Integer.toString(menu.getNumberOfLines()));
        menu.show();

    }
}
