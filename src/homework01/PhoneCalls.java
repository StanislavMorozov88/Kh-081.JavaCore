package homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PhoneCalls {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The first call was from country_1, one minute costs:");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("Talk lasted:");
        int t1 = Integer.parseInt(br.readLine());
        int cost1 = c1*t1;
        System.out.println("Call from country_1 costs "+ cost1);

        System.out.println("The second call was from country_2, one minute costs:");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("Talk lasted:");
        int t2 = Integer.parseInt(br.readLine());
        int cost2 = c2*t2;
        System.out.println("Call from country_2 costs "+ cost2);

        System.out.println("The third call was from country_3, one minute costs:");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("Talk lasted:");
        int t3 = Integer.parseInt(br.readLine());
        int cost3 = c3*t3;
        System.out.println("Call from country_3 costs "+ cost3);

        int total = cost1+cost2+cost3;
        System.out.println("The total cost of all phone calls is " + total);
    }
}
