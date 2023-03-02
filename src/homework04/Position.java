package homework04;

public class Position {
    public static void main(String[] args) {
        int[] numbers = {11, -10, 22, -50, 300};

        int min = numbers[0];
        int imin = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers [i];
                imin = i;
            }
            i++;
        }
        System.out.println("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " position");

        int positive = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive = positive + 1;
                if (positive == 2) {
                    System.out.println("Second positive number is " + numbers[i]);
                }
            }
            continue;
        }

    }
}
