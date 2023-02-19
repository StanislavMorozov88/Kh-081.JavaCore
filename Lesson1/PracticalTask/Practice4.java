import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program takes input and answer with this input
 */
public class Practice4 {

    public static void main(String[] args) throws IOException {
        System.out.println("How are you?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Initializing reader
        String answer = reader.readLine();
        reader.close(); //Closing reader
        System.out.println("You are " + answer);
    }
}
