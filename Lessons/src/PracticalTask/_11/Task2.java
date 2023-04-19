package PracticalTask._11;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter surname, name and patronymic in one line below:");

        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine().trim();
        String[] parts = fullName.split("[ \\t]+");

        while (parts.length>3){
            System.err.println("This app doesn't support multi-name, try again:");
            fullName = sc.nextLine().trim();
            parts = fullName.split("[ \\t]+");
        }
        sc.close();

        String surname = makeFirstUppercase(parts[0]);
        String name = makeFirstUppercase(parts[1]);
        String middleName = makeFirstUppercase(parts[2]);

        //surnames and initials
        System.out.println(surname + " " + name.charAt(0) + ". " + middleName.charAt(0) + ". ");

        //name
        System.out.println(name);

        //name, middle name and last name
        System.out.println(name + ", " + middleName + " " + surname);



    }

    public static String makeFirstUppercase(@NotNull String str){
        return str.toLowerCase().replaceFirst("\\w", String.valueOf(str.charAt(0)).toUpperCase());
    }
}
/*
* Enter surname, name and patronymic on the console as a variable of type String.
* Output on the console:
*   surnames and initials
*   name
*   name, middle name and last name
*/