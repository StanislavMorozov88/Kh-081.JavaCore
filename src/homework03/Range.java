package homework03;

public class Range {
    public static void main(String[] args) {
        float a = 4.5f, b = 0.3f, c = -5.1f;
        if (-5 <= a && a <= 5) {
            System.out.println(a + " belongs to range [-5; 5]");
        }
        if (-5 <= b && b <= 5) {
            System.out.println(b + " belongs to range [-5; 5]");
        }
        if (-5 <= c && c <= 5) {
            System.out.println(c + " belongs to range [-5; 5]");
        }
    }
}