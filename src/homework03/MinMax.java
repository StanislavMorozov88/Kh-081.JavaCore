package homework03;

public class MinMax {
    public static void main(String[] args) {
        int a = 254, b = 255, c = 876;

        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);

        int min = Math.min(a, Math.min(b, c));
        System.out.println(min);
    }
}
