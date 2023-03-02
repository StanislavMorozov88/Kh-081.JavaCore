import java.util.Arrays;
public class Test3 {
    private static int[] a = {2, 4, 8, 16, 32};

    public static void method() {
        for (int i = a.length/2; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        System.out.println(Arrays.toString(a));
        }

    public static void main(String s[]) {
        method();

    }

}
