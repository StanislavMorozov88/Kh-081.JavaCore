import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program asks user about his name and address, then prints this information
 */
public class Homework2 {

    /* Main method that runs program */
    public static void main(String[] args) throws IOException {

        String name, address; // Initializing vars
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Initializing reader
        System.out.println("What is your name?");
        name = reader.readLine();
        System.out.println("Where are you live " + name + "?");
        address = reader.readLine();
        reader.close(); // Closing reader
        System.out.println("Your name is " + name + "\nYou live in " + address);
    }
}
