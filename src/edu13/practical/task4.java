package edu13.practical;

public class task4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 9, 12, -10, 45, 26, 99, 4}; // size = 10
        int a = count(array, (n)-> n > 10);
        int b = count(array, (n)-> n > 50);
        int c = count(array, (n)-> n < 0);

        System.out.println("Count of elements, which > 10 = " + a);
        System.out.println("Count of elements, which > 50  = " + b);
        System.out.println("Count of elements, which < 0 = " + c);


    }

    private static int count(int[] arr, Operation operation)   {
        int count = 0;
        for(int i : arr){
            if(operation.isEqual(i))
                count++;
        }
        return count;
    }

    interface Operation{
        boolean isEqual(int n);
    }
}
