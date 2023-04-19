package PracticalTask._11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, enter two variables of type \033[0;36mString\033[0m below \n" +
                "to know, is the \033[0;36mfirst\033[0m variable are \033[0;36msubstring of second\033[0m.");
        System.out.print("String 1: ");
        String str1 = sc.nextLine();
        System.out.print("String 2: ");
        String str2 = sc.nextLine();
        sc.close();
        System.out.println();

        if (str2.contains(str1)) {
            System.out.println("Yes, \"\033[0;36m" + str1 + "\033[0m\"" + " is a substring of " + "\"\033[0;36m" + str2 + "\033[0m\".");
        } else {
            System.out.println("No, \"\033[0;36m" + str1 + "\033[0m\"" + " is not a substring of " + "\"\033[0;36m" + str2 + "\033[0m\".");
        }
    }
}
/* "\033[0;36m" +  + "\033[0m"
* Enter the two variables of type String.
* Determine whether the first variable substring second.
* For example, if you typed «IT» and «IT Academy» you must receive true.
*/