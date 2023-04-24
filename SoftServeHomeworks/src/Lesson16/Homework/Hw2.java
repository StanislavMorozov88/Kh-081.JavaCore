package Lesson16.Homework;

import java.io.*;

public class Hw2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("Homework2");
        String text = "public class Developer extends  Employee {\n" +
                "    private String position = \"Java developer\";\n" +
                "\n" +
                "    public Developer(String name, int salary, int age) {\n" +
                "        super(name, salary, age);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String report() {\n" +
                "        return String.format(\"Name: %1s , Salary: %1d , Position: %2s , Age: %2d\", super.getName(), super.getSalary(), position , super.getAge());\n" +
                "    }\n" +
                "}";
        outputStream.write(text.getBytes());
        StringBuilder sb = new StringBuilder();
        FileInputStream inputStream = new FileInputStream("Homework2");
        Reader reader = new FileReader("Homework2");
        while (reader.ready()){
            sb.append((char)reader.read());
        }
        String text2 = sb.toString();

        String replacedText = text.replace("public", "private");
        FileOutputStream outputStream2 = new FileOutputStream("Homework2 with replaced text");
        outputStream2.write(replacedText.getBytes());
    }
}
