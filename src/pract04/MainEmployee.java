package pract04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainEmployee {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee e1 = new Employee("Nick", 1, 12500);
        Employee e2 = new Employee("Paul", 2, 15.500F);
        Employee e3 = new Employee("Mary", 2, 14.300F);
        Employee e4 = new Employee("Mark", 3, 25.200F);
        Employee e5 = new Employee("Helga", 2, 10.750F);

        System.out.println("Enter the number of department ");
        int number = Integer.parseInt(br.readLine());

        if (number == e1.getDepartmentNumber()) {
            System.out.println(e1);
        }
        System.out.println("There is no employees, working in the department " + number);

    }
}