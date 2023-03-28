package homework04;

import java.util.Scanner;

//завдання 3
//ти зробила правильно, але не доробила
public class ArrayOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int countPositives = 0;
        int secondPositiveIndex = -1;
        int min = nums[0];
        int minIndex = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                countPositives++;
                if (countPositives == 2) {
                    secondPositiveIndex = i;
                }
            }
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
            if (nums[i] % 2 == 0) {
                product *= nums[i];
            }
        }

        if (secondPositiveIndex != -1) {
            System.out.println("The position of the second positive number is: " + secondPositiveIndex);
        } else {
            System.out.println("There is no second positive number.");
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The position of the minimum value is: " + minIndex);

        if (product != 1) {
            System.out.println("The product of all even numbers is: " + product);
        } else {
            System.out.println("There are no even numbers in the array.");
        }
    }
}