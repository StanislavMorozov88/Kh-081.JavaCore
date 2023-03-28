package homework11;

public class Task2 {
    public static void main(String[] args) {
        String text = "   I   am  learning   Java  Core    ";

        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        System.out.println(text.trim());

    }
}
