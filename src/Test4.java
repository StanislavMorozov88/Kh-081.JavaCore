public class Test4 {
    public static void main(String s[]) {
        int sum = 0;
        for (int i = 2; i <=12; i = i + 2) {
            if (i % 3 == 0) continue;
            if (i ==8) break;
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
