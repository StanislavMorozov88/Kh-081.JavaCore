package homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheckYear {
    static boolean checkIsLeapYear(int year) {
        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the year number: ");
        int year = Integer.parseInt(br.readLine());
        System.out.println(checkIsLeapYear(year));
    }
}
