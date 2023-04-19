package PracticalTask._11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String usenrame;
        for (int i = 0; i < 5; i++) {
            System.out.print("Username: ");
            usenrame = getUsername();
            if (isValidUsername(usenrame)) {
                System.out.println("\t-This username \033[0;36mis ok\033[0m.");
            } else {
                System.out.println("\t-\"\033[0;31m" + usenrame + "\033[0m\" is \033[0;31mnot valid\033[0m username.");
            }
        }
        sc.close();
    }

    public static String getUsername() {
        return sc.nextLine().trim();
    }

    public static boolean isValidUsername(String username) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.find();
    }
}

/*
 * The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 * Using regular expressions implement checking the username for validity.
 * Input five names in the main method.
 * Output a message to the console of the validation of each of the entered names.
 */
