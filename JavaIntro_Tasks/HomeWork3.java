import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first call cost : ");
        float c1 = sc.nextFloat();
        System.out.println("Enter minutes: ");
        int t1 = sc.nextInt();

        System.out.println("Enter the second call cost : ");
        float c2 = sc.nextFloat();
        System.out.println("Enter minutes: ");
        int t2 = sc.nextInt();

        System.out.println("Enter the third call cost : ");
        float c3 = sc.nextFloat();
        System.out.println("Enter minutes: ");
        int t3 = sc.nextInt();

        float p1 = c1 * t1;
        float p2 = c2 * t2;
        float p3 = c3 * t3;
        float totalPrice = p1 + p2 + p3;

        System.out.println("First call costs: " + p1);
        System.out.println("Second call costs: " + p2);
        System.out.println("Third call costs: " + p3);
        System.out.println("-------------------------");
        System.out.println("Total price: " + totalPrice);
    }
}