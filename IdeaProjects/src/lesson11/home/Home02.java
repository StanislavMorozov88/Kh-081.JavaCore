package lesson11.home;

public class Home02 {
    public static void main(String[] args) {
        String string = "What    a   wonderful   day   ";
        String convert = convertDoubleSpaces(string);
        System.out.println(convert);
    }

    public static String convertDoubleSpaces(String str) {
        return String.join(" ", str.split("\\s+"));
    }
}
