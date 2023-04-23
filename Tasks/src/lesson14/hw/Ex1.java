package lesson14.hw;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 * 1) number of lines in file1.txt.
 * 2) the longest line in file1.txt.
 * 3) your name and birthday date.
 */

public class Ex1 {
    public static void main(String[] args) {
        String fileName = "file1.txt";
        String fileName2 = "file2.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            String str;
            String[] strArr = null;
            System.out.println("Read data from file" + fileName);
            while ((str = bufferedReader.readLine()) != null) {
                //Each array item contains one line
                strArr = str.split("\\. ");
            }
            //print text
            Arrays.stream(strArr).forEach(System.out::println);
            //number of lines in file1.txt.
            int count = strArr.length;
            System.out.println("Number of lines : " + count);
            //the longest line in file1.txt.
            String longest = Arrays.stream(strArr).max(Comparator.comparing(String::length)).get();
            System.out.println("The longest line: \n" + longest);

            //Write in to the file2.txt
            System.out.println("Write data to file: " + fileName2);
            bufferedWriter.write(count + "\n" + longest + "\nMaria Rodriguez " + " 2000 ");
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
    }
}
