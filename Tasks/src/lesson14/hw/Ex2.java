package lesson14.hw;

import java.io.*;

/**
 * A file with java code is given.
 * Read program text from file and all words public in the declaration of class
 * attributes and methods should be replaced with the word private.
 * Save the result to another previously created file.
 */

public class Ex2 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt")); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            String str;
            String s = null;
            while ((str = bufferedReader.readLine()) != null) {
                s = str.replaceAll("public", "private");
            }
            bufferedWriter.write(s);
        } catch (IOException e) {
            System.out.println("File Read/Write Error");
        }
    }
}
