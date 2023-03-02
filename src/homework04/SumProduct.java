package homework04;

public class SumProduct {
    public static void main(String[] args) {
        int[] numbers = {11, -10, 22, -20, 30, 100, 50, -30, 45, -65};
        int n = 10;

        int sum = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] < 0) {
                continue;
            }
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);

        int product = 1;
        for (int i = 5; i < numbers.length; i++)
        {
            if (numbers[i] < 0) {
                product *= numbers[i];
            }
        }
        System.out.println("Product = " + product);
    }
}
