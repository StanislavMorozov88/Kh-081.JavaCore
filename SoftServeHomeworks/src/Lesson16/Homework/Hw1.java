package Lesson16.Homework;

import java.io.*;
import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("D:\\Рабочий Стол\\mytext.txt");
        FileOutputStream outputStream = new FileOutputStream("file1.txt");

        while (inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
        }
        String[] strings = readLinesFromFile("file1.txt");
        System.out.println(Arrays.toString(strings));
        FileInputStream inputStream2 = new FileInputStream("file1.txt");
        FileOutputStream outputStream2 = new FileOutputStream("file2.txt");
        String longestLine = "";
        String num = String.valueOf(strings.length);
        outputStream2.write(strings.length);
        for(String line : strings){
            if(line.length() > longestLine.length() ){
               longestLine = line;
            }
        }
        outputStream2.write(longestLine.getBytes());
        outputStream2.write("\n".getBytes());
        outputStream2.write(num.getBytes());
        outputStream2.write("\n".getBytes());
        outputStream2.write("Nikita, 08".getBytes());






    }
    public static String[] readLinesFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int x;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            return sb.toString().split(System.lineSeparator());
        } catch (IOException e) {
            e.getMessage();
        }
        return new String[0];
    }
}
