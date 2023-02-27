package com.softserve.edu05;

public class Exp3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Input number");
//            n = sc.nextInt();
//            if (n < 0){
//                break;
//            }
//        }
//        System.out.println(n);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int n;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Input number");
//            n = sc.nextInt();
//            if (n < 0){
//                continue;
//            }
//            sum += n;
//        }
//        System.out.println(sum);
//        sc.close();
        int[] arr = {2, -5, 7, -4, 8};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                product = product * arr[i];
            }
        }
        System.out.println("Product = " + product);

        int amount = 0;
        for (int a : arr) {
            if (a > -5 && a < 8) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);

    }
}
